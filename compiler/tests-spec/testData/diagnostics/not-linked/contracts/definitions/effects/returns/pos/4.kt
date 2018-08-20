// !LANGUAGE: +AllowContractsForCustomFunctions +UseCallsInPlaceEffect
// !DIAGNOSTICS: -INVISIBLE_REFERENCE -INVISIBLE_MEMBER -FINAL_UPPER_BOUND
// !WITH_CLASSES

/*
 KOTLIN DIAGNOSTICS NOT LINKED SPEC TEST (POSITIVE)

 SECTION: Contracts
 CATEGORY: definitions, effects, returns
 NUMBER: 4
 DESCRIPTION: Returns effect with complex conditions (using logic operators || and &&).
 */

import kotlin.internal.contracts.*

// CASE DESCRIPTION: complex condition with boolean value check of the function parameters
fun case_1(cond1: Boolean, cond2: Boolean, cond3: Boolean) {
    contract {
        returns() implies (cond1 && !cond2 || cond3)
    }
    if (!(cond1 && !cond2 || cond3)) throw Exception()
}

// CASE DESCRIPTION: complex condition with the type checking of the function parameters
fun case_2(value1: Any?, value2: Any?, value3: Any?) {
    contract {
        returns() implies (value1 is String? || value2 !is Int && value3 !is Nothing?)
    }
    if (!(value1 is String? || value2 !is Int && value3 !is Nothing?)) throw Exception()
}

// CASE DESCRIPTION: complex condition with the null checks of the function parameters
fun case_3(value1: Any?, value2: Any?, value3: Any?) {
    contract {
        returns() implies (value1 == null || value2 != null && value3 == null)
    }
    if (!(value1 == null || value2 != null && value3 == null)) throw Exception()
}

// CASE DESCRIPTION: complex condition with the null check and boolean value check of the current extensible class
fun Boolean?.case_4(): Boolean {
    contract {
        returns(true) implies (this@case_4 != null && <!DEBUG_INFO_SMARTCAST!>this@case_4<!>)
    }
    return this != null && <!DEBUG_INFO_SMARTCAST!>this<!>
}

// CASE DESCRIPTION: complex condition with the null check, type checking and boolean value check of the current extensible class (generic extension function with upper bound type)
fun <T : Boolean>T?.case_5(): Boolean {
    contract {
        returns(true) implies (this@case_5 != null && this@case_5 !is Nothing && <!DEBUG_INFO_SMARTCAST!>this@case_5<!>)
    }
    return this != null && this !is Nothing && <!DEBUG_INFO_SMARTCAST!>this<!>
}

// CASE DESCRIPTION: complex condition with type checking and null check of the current extensible class
fun <T>T.case_6(): Boolean {
    contract {
        returns(false) implies (this@case_6 is Char || this@case_6 == null) // rudundant second null-check
    }
    return !(this is Char || this == null)
}

/*
 CASE DESCRIPTION: complex condition with the null check, type checking and boolean value check of the current extensible class
 UNEXPECTED BEHAVIOUR
 ISSUES: KT-1982
 */
fun <T>T?.case_7() {
    contract {
        returns() implies (this@case_7 == null || this@case_7 is Boolean? && !<!DEBUG_INFO_SMARTCAST!>this@case_7<!>) // duplicate of null-check
    }
    if (!(this == null || this is Boolean? && !<!DEBUG_INFO_SMARTCAST!>this<!>)) throw Exception()
}

class A<T> : _ClassLevel5() {
    inner class B {
        /*
         CASE DESCRIPTION: complex condition with the null check and type checking of the current extensible class, inner and top-level classes
         UNEXPECTED BEHAVIOUR
         ISSUES: KT-1982
         */
        fun <K : Number?>K.case_8() {
            contract {
                returns() implies (this@B !is _ClassLevel1 && <!SENSELESS_COMPARISON!>this@B != null<!> || <!USELESS_IS_CHECK!>this@A is _ClassLevel1<!> && this@case_8 is Float)
            }
            if (!(this@B !is _ClassLevel1 && <!SENSELESS_COMPARISON!>this@B != null<!> || <!USELESS_IS_CHECK!>this@A is _ClassLevel1<!> && this is Float)) throw Exception()
        }

        /*
         CASE DESCRIPTION: complex condition with the null check and type checking of the inner and top-level classes
         UNEXPECTED BEHAVIOUR
         ISSUES: KT-1982
         */
        fun case_9() {
            contract {
                returns() implies (this@B !is _ClassLevel1 || <!USELESS_IS_CHECK!>this@A is _ClassLevel1<!> || <!SENSELESS_COMPARISON!>this@B == null<!>)
            }
            if (!(this@B !is _ClassLevel1 || <!USELESS_IS_CHECK!>this@A is _ClassLevel1<!> || <!SENSELESS_COMPARISON!>this@B == null<!>)) throw Exception()
        }
    }
}
