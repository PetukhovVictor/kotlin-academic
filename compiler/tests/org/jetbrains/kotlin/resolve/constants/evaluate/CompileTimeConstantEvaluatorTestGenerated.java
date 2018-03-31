/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.resolve.constants.evaluate;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class CompileTimeConstantEvaluatorTestGenerated extends AbstractCompileTimeConstantEvaluatorTest {
    @TestMetadata("compiler/testData/evaluate/constant")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Constant extends AbstractCompileTimeConstantEvaluatorTest {
        public void testAllFilesPresentInConstant() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/evaluate/constant"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("classObjectProperty.kt")
        public void testClassObjectProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/classObjectProperty.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("compareTo.kt")
        public void testCompareTo() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/compareTo.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("differentTypes.kt")
        public void testDifferentTypes() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/differentTypes.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("divideByZero.kt")
        public void testDivideByZero() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/divideByZero.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("equals.kt")
        public void testEquals() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/equals.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("exceptionWhenEvaluate.kt")
        public void testExceptionWhenEvaluate() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/exceptionWhenEvaluate.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("finalProperty.kt")
        public void testFinalProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/finalProperty.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("float.kt")
        public void testFloat() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/float.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("floatsAndDoubles.kt")
        public void testFloatsAndDoubles() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/floatsAndDoubles.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("integer.kt")
        public void testInteger() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/integer.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("integerOperations.kt")
        public void testIntegerOperations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/integerOperations.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("integers.kt")
        public void testIntegers() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/integers.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("localVal.kt")
        public void testLocalVal() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/localVal.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("localVar.kt")
        public void testLocalVar() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/localVar.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("nonFinalProperty.kt")
        public void testNonFinalProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/nonFinalProperty.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("objectProperty.kt")
        public void testObjectProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/objectProperty.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("strings.kt")
        public void testStrings() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/strings.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("topLevelVal.kt")
        public void testTopLevelVal() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/topLevelVal.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("topLevelVar.kt")
        public void testTopLevelVar() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/topLevelVar.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("unaryMinusIndepWoExpType.kt")
        public void testUnaryMinusIndepWoExpType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/unaryMinusIndepWoExpType.kt");
            doConstantTest(fileName);
        }

        @TestMetadata("unaryMinusIndependentExpType.kt")
        public void testUnaryMinusIndependentExpType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/constant/unaryMinusIndependentExpType.kt");
            doConstantTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/evaluate/isPure")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class IsPure extends AbstractCompileTimeConstantEvaluatorTest {
        public void testAllFilesPresentInIsPure() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/evaluate/isPure"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("innerToType.kt")
        public void testInnerToType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/isPure/innerToType.kt");
            doIsPureTest(fileName);
        }

        @TestMetadata("namedConstants.kt")
        public void testNamedConstants() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/isPure/namedConstants.kt");
            doIsPureTest(fileName);
        }

        @TestMetadata("toType.kt")
        public void testToType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/isPure/toType.kt");
            doIsPureTest(fileName);
        }

        @TestMetadata("unaryMinusIndepWoExpType.kt")
        public void testUnaryMinusIndepWoExpType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/isPure/unaryMinusIndepWoExpType.kt");
            doIsPureTest(fileName);
        }

        @TestMetadata("unaryMinusIndependentExpType.kt")
        public void testUnaryMinusIndependentExpType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/isPure/unaryMinusIndependentExpType.kt");
            doIsPureTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/evaluate/usesVariableAsConstant")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UsesVariableAsConstant extends AbstractCompileTimeConstantEvaluatorTest {
        public void testAllFilesPresentInUsesVariableAsConstant() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/evaluate/usesVariableAsConstant"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("binaryTypes.kt")
        public void testBinaryTypes() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/usesVariableAsConstant/binaryTypes.kt");
            doUsesVariableAsConstantTest(fileName);
        }

        @TestMetadata("NamedConstants.kt")
        public void testNamedConstants() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/usesVariableAsConstant/NamedConstants.kt");
            doUsesVariableAsConstantTest(fileName);
        }

        @TestMetadata("OtherTypes.kt")
        public void testOtherTypes() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/usesVariableAsConstant/OtherTypes.kt");
            doUsesVariableAsConstantTest(fileName);
        }

        @TestMetadata("simpleTypes.kt")
        public void testSimpleTypes() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/evaluate/usesVariableAsConstant/simpleTypes.kt");
            doUsesVariableAsConstantTest(fileName);
        }
    }
}
