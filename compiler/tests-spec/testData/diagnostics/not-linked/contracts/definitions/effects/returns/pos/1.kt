// !LANGUAGE: +AllowContractsForCustomFunctions +UseCallsInPlaceEffect
// !DIAGNOSTICS: -INVISIBLE_REFERENCE -INVISIBLE_MEMBER
// !WITH_OBJECTS

/*
 KOTLIN DIAGNOSTICS NOT LINKED SPEC TEST (POSITIVE)

 SECTION: Contracts
 CATEGORY: definitions, effects, returns
 NUMBER: 1
 DESCRIPTION: Using reference equality as implies argument.
 UNEXPECTED BEHAVIOUR
 ISSUES: KT-26177
 */

import kotlin.internal.contracts.*

fun case_1(x: Any?): Boolean {
    contract {
        returns(true) implies (x === _EmptyObject) // should be not allowed
    }
    return x === _EmptyObject
}
