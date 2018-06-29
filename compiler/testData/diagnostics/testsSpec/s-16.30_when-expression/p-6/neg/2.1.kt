// !CHECK_TYPE

/*
 KOTLIN SPEC TEST (NEGATIVE)

 SECTION 16.30: When expression
 PARAGRAPH: 6
 SENTENCE 2: It has an else entry;
 NUMBER: 1
 DESCRIPTION: Checking for not exhaustive when without bound value when there is no else branch.
 */

fun test1(value: Int): Int = <!NO_ELSE_IN_WHEN!>when<!> {
    value == 1 -> 1
    value == 2 -> 2
    value == 3 -> 3
}

fun test2(value: Int): Int = <!NO_ELSE_IN_WHEN!>when<!> {
    value == 1 -> 1
}

fun test3(): Int = <!NO_ELSE_IN_WHEN!>when<!> {}
