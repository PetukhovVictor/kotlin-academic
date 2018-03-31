/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.cfg;

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
@TestMetadata("compiler/testData/diagnostics/testWithModifiedMockJdk")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DiagnosticsWithModifiedMockJdkTestGenerated extends AbstractDiagnosticsWithModifiedMockJdkTest {
    public void testAllFilesPresentInTestWithModifiedMockJdk() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testWithModifiedMockJdk"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("notConsideredMethod.kt")
    public void testNotConsideredMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testWithModifiedMockJdk/notConsideredMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("throwableConstructor.kt")
    public void testThrowableConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testWithModifiedMockJdk/throwableConstructor.kt");
        doTest(fileName);
    }
}
