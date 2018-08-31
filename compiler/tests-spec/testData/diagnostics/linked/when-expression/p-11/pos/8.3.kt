// !WITH_SEALED_CLASSES
// !DIAGNOSTICS: -UNUSED_PARAMETER

/*
 KOTLIN DIAGNOSTICS SPEC TEST (POSITIVE)

 SECTION: when-expression
 PARAGRAPH: 11
 SENTENCE: [8] The bound expression is of a nullable type and one of the cases above is met for its non-nullable counterpart and, in addition, there is a condition containing literal null.
 NUMBER: 3
 DESCRIPTION: Check when exhaustive when possible subtypes of the sealed class are covered and contains a null check.
 */

// CASE DESCRIPTION: Checking for exhaustive 'when' (all sealed class subtypes and null value covered).
fun case_1(expr: _SealedClass?): Int = when (expr) {
    is _SealedChild1 -> <!DEBUG_INFO_SMARTCAST!>expr<!>.number
    is _SealedChild2 -> <!DEBUG_INFO_SMARTCAST!>expr<!>.e1 + <!DEBUG_INFO_SMARTCAST!>expr<!>.e2
    is _SealedChild3 -> <!DEBUG_INFO_SMARTCAST!>expr<!>.m1 + <!DEBUG_INFO_SMARTCAST!>expr<!>.m2
    null -> 0
}

// CASE DESCRIPTION: Checking for exhaustive 'when' (sealed class itself and null value covered).
fun case_2(expr: _SealedClass?): String = when (expr) {
    is _SealedClass -> ""
    null -> ""
}

// CASE DESCRIPTION: Checking for exhaustive 'when' (all sealed class with methods subtypes and null value covered).
fun case_3(expr: _SealedClassWithMethods?): String = when (expr) {
    is _SealedWithMethodsChild1 -> <!DEBUG_INFO_SMARTCAST!>expr<!>.m1()
    is _SealedWithMethodsChild2 -> <!DEBUG_INFO_SMARTCAST!>expr<!>.m2()
    is _SealedWithMethodsChild3 -> <!DEBUG_INFO_SMARTCAST!>expr<!>.m3()
    null -> ""
}

// CASE DESCRIPTION: Checking for exhaustive 'when' (all objects covered using implicit equality operator and null value covered).
fun case_4(expr: _SealedClassWithObjects?): String = when (expr) {
    _SealedWithObjectsChild1 -> ""
    _SealedWithObjectsChild2 -> ""
    _SealedWithObjectsChild3 -> ""
    null -> ""
}

// CASE DESCRIPTION: Checking for exhaustive 'when' (all subtypes and objects covered + null value covered).
fun case_5(value_1: _SealedClassMixed?): String = when (value_1) {
    is _SealedMixedChild1 -> ""
    is _SealedMixedChild2 -> ""
    is _SealedMixedChild3 -> ""
    _SealedMixedChildObject1 -> ""
    _SealedMixedChildObject2 -> ""
    _SealedMixedChildObject3 -> ""
    null -> ""
}

/*
 CASE DESCRIPTION: Checking for exhaustive 'when' (all subtypes and objects (using type checking operator) covered + null value covered).
 DISCUSSION: is it correct that objects can be checked using the type checking operator?
 */
fun case_6(value_1: _SealedClassMixed?): String = when (value_1) {
    is _SealedMixedChild1 -> ""
    is _SealedMixedChild2 -> ""
    is _SealedMixedChild3 -> ""
    is _SealedMixedChildObject1 -> ""
    is _SealedMixedChildObject2 -> ""
    is _SealedMixedChildObject3 -> ""
    null -> ""
}

/*
 CASE DESCRIPTION: Checking for exhaustive 'when' on the object of sealed class with custom equals.
 UNEXPECTED BEHAVIOUR: runtime expecption kotlin.NoWhenBranchMatchedException is thrown
 */
sealed class case_7_SealedClassWithCustomEquals {
    override fun equals(other: Any?) = false
}
object case_7_objectWithCustomEquals : case_7_SealedClassWithCustomEquals()
fun case_7(value_1: case_7_SealedClassWithCustomEquals) {
    return when (value_1) {
        case_7_objectWithCustomEquals -> {}
    }
}

/*
 CASE DESCRIPTION: Checking for exhaustive 'when' on the object and class of sealed class with custom equals.
 UNEXPECTED BEHAVIOUR: runtime expecption kotlin.NoWhenBranchMatchedException is thrown
 */
sealed class case_8_SealedClassWithCustomEquals {
    override fun equals(other: Any?) = false
}
object case_8_objectWithCustomEquals : case_8_SealedClassWithCustomEquals()
class case_8_classWithCustomEquals : case_8_SealedClassWithCustomEquals()
fun case_8(value_1: case_8_SealedClassWithCustomEquals) {
    return when (value_1) {
        case_8_objectWithCustomEquals -> {}
        is case_8_classWithCustomEquals -> {}
    }
}

/*
 CASE DESCRIPTION: Checking for exhaustive 'when' on the object of sealed class with custom equals (using type checing operator).
 */
sealed class case_9_SealedClassWithCustomEquals {
    override fun equals(other: Any?) = false
}

object case_9_objectWithCustomEquals : case_9_SealedClassWithCustomEquals()

fun case_9(value_1: case_9_SealedClassWithCustomEquals) {
    return when (value_1) {
        is case_9_objectWithCustomEquals -> {}
    }
}
