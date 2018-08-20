// !LANGUAGE: +AllowContractsForCustomFunctions +UseCallsInPlaceEffect
// !DIAGNOSTICS: -INVISIBLE_REFERENCE -INVISIBLE_MEMBER -FINAL_UPPER_BOUND
// !WITH_CLASSES

/*
 KOTLIN DIAGNOSTICS NOT LINKED SPEC TEST (POSITIVE)

 SECTION: Contracts
 CATEGORY: definitions, effects, returns
 NUMBER: 3
 DESCRIPTION: Returns effect with simple conditions.
 */

import kotlin.internal.contracts.*

// CASE DESCRIPTION: boolean condition on the function parameter
fun case_1(cond: Boolean) {
    contract {
        returns() implies (cond)
    }
    if (!cond) throw Exception()
}

// CASE DESCRIPTION: boolean condition (not operator) on the function parameter
fun case_2(cond: Boolean): Boolean {
    contract {
        returns(false) implies (!cond)
    }
    return cond
}

// CASE DESCRIPTION: boolean condition (not operator) on the current extensible class of Boolean type (extension function)
fun Boolean.case_3() {
    contract {
        returns() implies (!this@case_3)
    }
    if (this@case_3) throw Exception()
}

// CASE DESCRIPTION: boolean condition on the current extensible class of Boolean type (generic extension function)
fun <T : Boolean>T.case_4(): Boolean? {
    contract {
        returns(null) implies (!this@case_4)
    }
    return if (!this) null else true
}

// CASE DESCRIPTION: type checking condition on the function parameter
fun case_5(value: Any?) {
    contract {
        returns() implies (value is String)
    }
    if (value !is String) throw Exception()
}

// CASE DESCRIPTION: invert type checking condition on the function nullable parameter
fun case_6(value: Any?) {
    contract {
        returns() implies (value !is String?)
    }
    if (value is String?) throw Exception()
}

// CASE DESCRIPTION: type checking condition on the currect object (extension function)
fun Any?.case_7() {
    contract {
        returns() implies (this@case_7 is Number)
    }
    if (this !is Number) throw Exception()
}

// CASE DESCRIPTION: invert type checking condition on the currect object (generic extension function)
fun <T>T?.case_8() {
    contract {
        returns() implies (this@case_8 !is _ClassLevel3?)
    }
    if (this is _ClassLevel3?) throw Exception()
}

// CASE DESCRIPTION: type checking condition on the currect object (generic extension function with upper bound type)
fun <T : Number?>T.case_9(): Boolean? {
    contract {
        returns(null) implies (this@case_9 is Byte?)
    }
    return if (this is Byte?) null else true
}

// CASE DESCRIPTION: null check condition on the function parameter
fun case_10(value: Any?) {
    contract {
        returns() implies (value == null)
    }
    if (value != null) throw Exception()
}

// CASE DESCRIPTION: not-null check condition on the function parameter
fun case_11(value: Any?): Boolean? {
    contract {
        returns(null) implies (value != null)
    }
    return if (value != null) null else true
}

// CASE DESCRIPTION: null check condition on the not-null currect object (extension function)
fun Char.case_12() {
    contract {
        returns() implies (<!SENSELESS_COMPARISON!>this@case_12 == null<!>)
    }
    if (<!SENSELESS_COMPARISON!>this@case_12 != null<!>) throw Exception()
}

// CASE DESCRIPTION: null check condition on the currect object (generic extension function with upper bound type)
fun <T : Number>T?.case_13() {
    contract {
        returns() implies (this@case_13 == null)
    }
    if (this != null) throw Exception()
}

class SampleClass : _ClassLevel3() {
    /*
     CASE DESCRIPTION: type checking condition on the object of currect class (generic extension function with upper bound type within class)
     UNEXPECTED BEHAVIOUR
     ISSUES: KT-26244
     */
    fun <T : Number?>T.case_14(): Boolean {
        contract {
            returns(false) implies (<!USELESS_IS_CHECK!>this@SampleClass !is _ClassLevel1<!>)
        }
        return this == null
    }

    // CASE DESCRIPTION: not-null check condition on the function parameter within class
    fun case_15(number: Int?): Boolean {
        contract {
            returns(false) implies (number != null)
        }
        return number == null
    }

    // CASE DESCRIPTION: type checking condition on the current extensible class (generic extension function within class)
    fun <T>T?.case_16(): Boolean {
        contract {
            returns(false) implies (this@case_16 !is Number)
        }
        return this@case_16 is Number
    }

    // CASE DESCRIPTION: invert boolean value check on the current extensible class of Boolean type (generic extension function within class)
    fun <T : Boolean>T.case_17() {
        contract {
            returns() implies (!this@case_17)
        }
        if (this) throw Exception()
    }

    /*
     CASE DESCRIPTION: boolean conditions with `this` labeled by not extensible class of the current function
     UNEXPECTED BEHAVIOUR
     ISSUES: KT-26244
     */
    fun <T>T.case_18_extFun() {
        fun case_18_contractFun() {
            contract {
                returns() implies (this@case_18_extFun is _ClassLevel1)
            }
            if (this@case_18_extFun !is _ClassLevel1) throw Exception()
        }

        case_18_contractFun()

        println("!") // unreachable?
    }
    fun case_18() = _ClassLevel3().case_18_extFun()
}
