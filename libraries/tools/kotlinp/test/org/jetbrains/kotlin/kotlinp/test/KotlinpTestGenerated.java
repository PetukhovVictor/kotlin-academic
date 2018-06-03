/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.kotlinp.test;

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
@TestMetadata("libraries/tools/kotlinp/testData")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinpTestGenerated extends AbstractKotlinpTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInTestData() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("libraries/tools/kotlinp/testData"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("Annotations.kt")
    public void testAnnotations() throws Exception {
        runTest("libraries/tools/kotlinp/testData/Annotations.kt");
    }

    @TestMetadata("Lambda.kt")
    public void testLambda() throws Exception {
        runTest("libraries/tools/kotlinp/testData/Lambda.kt");
    }

    @TestMetadata("LocalClass.kt")
    public void testLocalClass() throws Exception {
        runTest("libraries/tools/kotlinp/testData/LocalClass.kt");
    }

    @TestMetadata("MultiFileClass.kt")
    public void testMultiFileClass() throws Exception {
        runTest("libraries/tools/kotlinp/testData/MultiFileClass.kt");
    }

    @TestMetadata("NestedClasses.kt")
    public void testNestedClasses() throws Exception {
        runTest("libraries/tools/kotlinp/testData/NestedClasses.kt");
    }

    @TestMetadata("PlatformType.kt")
    public void testPlatformType() throws Exception {
        runTest("libraries/tools/kotlinp/testData/PlatformType.kt");
    }

    @TestMetadata("SimpleClass.kt")
    public void testSimpleClass() throws Exception {
        runTest("libraries/tools/kotlinp/testData/SimpleClass.kt");
    }

    @TestMetadata("SimplePackage.kt")
    public void testSimplePackage() throws Exception {
        runTest("libraries/tools/kotlinp/testData/SimplePackage.kt");
    }

    @TestMetadata("SyntheticClass.kt")
    public void testSyntheticClass() throws Exception {
        runTest("libraries/tools/kotlinp/testData/SyntheticClass.kt");
    }

    @TestMetadata("TypeParameters.kt")
    public void testTypeParameters() throws Exception {
        runTest("libraries/tools/kotlinp/testData/TypeParameters.kt");
    }

    @TestMetadata("VersionRequirement.kt")
    public void testVersionRequirement() throws Exception {
        runTest("libraries/tools/kotlinp/testData/VersionRequirement.kt");
    }
}
