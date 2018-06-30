// !DIAGNOSTICS: -UNUSED_VALUE - ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE

/*
 KOTLIN SPEC TEST (NEGATIVE)

 SECTION 16.30: When expression
 PARAGRAPH: 4
 SENTENCE 7: Any other expression.
 NUMBER: 1
 DESCRIPTION: 'When' with bound value and non-expressions in 'when condition'.
 */

// CASE DESCRIPTION: 'When' with while statement.
fun case_1(value: Int): String {
    when (value) {
        <!EXPRESSION_EXPECTED!>while (false) {}<!> -> return ""
        (<!EXPRESSION_EXPECTED!>while (true) {}<!>)<!UNREACHABLE_CODE!><!> -> <!UNREACHABLE_CODE!>return ""<!>
    }

    <!UNREACHABLE_CODE!>return ""<!>
}

// CASE DESCRIPTION: 'When' with do-while statement.
fun case_2(value: Int): String {
    when (value) {
        <!EXPRESSION_EXPECTED!>do {} while (false)<!> -> return ""
        (<!EXPRESSION_EXPECTED!>do {} while (true)<!>)<!UNREACHABLE_CODE!><!> -> <!UNREACHABLE_CODE!>return ""<!>
    }

    <!UNREACHABLE_CODE!>return ""<!>
}

// CASE DESCRIPTION: 'When' with for statement.
fun case_3(value: Int, value1: List<Int>): String {
    when (value) {
        <!EXPRESSION_EXPECTED!>for (value2 in value1) {}<!> -> return ""
        (<!EXPRESSION_EXPECTED!>for (value2 in value1) {}<!>) -> return ""
    }

    return ""
}

// CASE DESCRIPTION: 'When' with assignments.
fun case_4(value: Int): String {
    var value1: Int
    var value2 = 10

    when (value) {
        <!ASSIGNMENT_IN_EXPRESSION_CONTEXT!>value1 = 10<!> -> return ""
        (<!ASSIGNMENT_IN_EXPRESSION_CONTEXT!>value1 = 10<!>) -> return ""
        <!ASSIGNMENT_IN_EXPRESSION_CONTEXT!>value2 += 10<!> -> return ""
        <!ASSIGNMENT_IN_EXPRESSION_CONTEXT!>value2 -= 10<!> -> return ""
        <!ASSIGNMENT_IN_EXPRESSION_CONTEXT!>value2 *= 10<!> -> return ""
        <!ASSIGNMENT_IN_EXPRESSION_CONTEXT!>value2 /= 10<!> -> return ""
        <!ASSIGNMENT_IN_EXPRESSION_CONTEXT!>value2 %= 10<!> -> return ""
    }

    return ""
}