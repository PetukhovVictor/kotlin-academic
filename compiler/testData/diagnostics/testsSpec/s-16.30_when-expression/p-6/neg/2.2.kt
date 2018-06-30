// !CHECK_TYPE

/*
 KOTLIN SPEC TEST (NEGATIVE)

 SECTION 16.30: When expression
 PARAGRAPH: 6
 SENTENCE 2: It has an else entry;
 NUMBER: 2
 DESCRIPTION: Checking for not exhaustive when with bound value when there is no else branch.
 */

// CASE DESCRIPTION: Checking for not exhaustive in 'when' (several branches).
fun case_1(value: Int): String = <!NO_ELSE_IN_WHEN!>when<!>(value) {
    1 -> ""
    2 -> ""
    3 -> ""
}

// CASE DESCRIPTION: Checking for not exhaustive in 'when' (one branch).
fun case_2(value: Int): String = <!NO_ELSE_IN_WHEN!>when<!>(value) {
    1 -> ""
}

// CASE DESCRIPTION: Checking for not exhaustive in 'when' (no branches).
fun case_3(value: Int): Int = <!NO_ELSE_IN_WHEN!>when<!>(<!UNUSED_EXPRESSION!>value<!>) {}
