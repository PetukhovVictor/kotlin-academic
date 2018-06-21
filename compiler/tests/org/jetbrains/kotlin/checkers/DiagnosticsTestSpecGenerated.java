/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers;

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
@TestMetadata("compiler/testData/diagnostics/testsSpec")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DiagnosticsTestSpecGenerated extends AbstractDiagnosticsTestSpec {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInTestsSpec() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsSpec"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("compiler/testData/diagnostics/testsSpec/s16.30:when-expression")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class S16_30_when_expression extends AbstractDiagnosticsTestSpec {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        @TestMetadata("2.3.1-pos.kt")
        public void test2_3_1_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/2.3.1-pos.kt");
        }

        @TestMetadata("2.3.2-pos.kt")
        public void test2_3_2_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/2.3.2-pos.kt");
        }

        @TestMetadata("3.1.1-pos.kt")
        public void test3_1_1_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.1-pos.kt");
        }

        @TestMetadata("3.1.2-pos.kt")
        public void test3_1_2_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.2-pos.kt");
        }

        @TestMetadata("3.1.3-pos.kt")
        public void test3_1_3_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.3-pos.kt");
        }

        @TestMetadata("3.1.4-pos.kt")
        public void test3_1_4_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.4-pos.kt");
        }

        @TestMetadata("3.1.5-pos.kt")
        public void test3_1_5_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.5-pos.kt");
        }

        @TestMetadata("3.1.6-pos.kt")
        public void test3_1_6_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.6-pos.kt");
        }

        @TestMetadata("3.1.7-pos.kt")
        public void test3_1_7_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.7-pos.kt");
        }

        @TestMetadata("3.1.8-pos.kt")
        public void test3_1_8_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.8-pos.kt");
        }

        @TestMetadata("3.1.9-pos.kt")
        public void test3_1_9_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.9-pos.kt");
        }

        @TestMetadata("3.1.10-pos.kt")
        public void test3_1_10_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.10-pos.kt");
        }

        @TestMetadata("3.1.11-pos.kt")
        public void test3_1_11_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.11-pos.kt");
        }

        @TestMetadata("3.1.12-pos.kt")
        public void test3_1_12_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.12-pos.kt");
        }

        @TestMetadata("3.1.13-pos.kt")
        public void test3_1_13_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.13-pos.kt");
        }

        @TestMetadata("3.1.14-pos.kt")
        public void test3_1_14_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.14-pos.kt");
        }

        @TestMetadata("3.1.15-pos.kt")
        public void test3_1_15_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.15-pos.kt");
        }

        @TestMetadata("3.1.16-pos.kt")
        public void test3_1_16_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.16-pos.kt");
        }

        @TestMetadata("3.1.17-pos.kt")
        public void test3_1_17_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.17-pos.kt");
        }

        @TestMetadata("3.1.18-pos.kt")
        public void test3_1_18_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.18-pos.kt");
        }

        @TestMetadata("3.1.19-pos.kt")
        public void test3_1_19_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.19-pos.kt");
        }

        @TestMetadata("3.1.20-pos.kt")
        public void test3_1_20_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.20-pos.kt");
        }

        @TestMetadata("3.1.21-pos.kt")
        public void test3_1_21_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.21-pos.kt");
        }

        @TestMetadata("3.1.22-pos.kt")
        public void test3_1_22_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.22-pos.kt");
        }

        @TestMetadata("3.1.23-pos.kt")
        public void test3_1_23pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3.1.23-pos.kt");
        }

        @TestMetadata("3:1-pos.kt")
        public void test3_1_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3:1-pos.kt");
        }

        @TestMetadata("3:2-pos.kt")
        public void test3_2_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3:2-pos.kt");
        }

        @TestMetadata("3:3-pos.kt")
        public void test3_3_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3:3-pos.kt");
        }

        @TestMetadata("3:4-pos.kt")
        public void test3_4_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3:4-pos.kt");
        }

        @TestMetadata("3:5-pos.kt")
        public void test3_5_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3:5-pos.kt");
        }

        @TestMetadata("3:6-pos.kt")
        public void test3_6_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3:6-pos.kt");
        }

        @TestMetadata("3:7-pos.kt")
        public void test3_7_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/3:7-pos.kt");
        }

        @TestMetadata("4:11-pos.kt")
        public void test4_11_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/4:11-pos.kt");
        }

        @TestMetadata("4:1-pos.kt")
        public void test4_1_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/4:1-pos.kt");
        }

        @TestMetadata("4:2-pos.kt")
        public void test4_2_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/4:2-pos.kt");
        }

        @TestMetadata("4:3-pos.kt")
        public void test4_3_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/4:3-pos.kt");
        }

        @TestMetadata("4:5-pos.kt")
        public void test4_5_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/4:5-pos.kt");
        }

        @TestMetadata("4:7-pos.kt")
        public void test4_7_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/4:7-pos.kt");
        }

        @TestMetadata("4:9-pos.kt")
        public void test4_9_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/4:9-pos.kt");
        }

        @TestMetadata("5:2-pos.kt")
        public void test5_2_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/5:2-pos.kt");
        }

        @TestMetadata("5:4-pos.kt")
        public void test5_4_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/5:4-pos.kt");
        }

        @TestMetadata("5:7-pos.kt")
        public void test5_7_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/5:7-pos.kt");
        }

        @TestMetadata("5:8-pos.kt")
        public void test5_8_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/5:8-pos.kt");
        }

        @TestMetadata("5:9-pos.kt")
        public void test5_9_pos() throws Exception {
            runTest("compiler/testData/diagnostics/testsSpec/s16.30:when-expression/5:9-pos.kt");
        }

        public void testAllFilesPresentInS16_30_when_expression() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsSpec/s16.30:when-expression"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }
    }
}
