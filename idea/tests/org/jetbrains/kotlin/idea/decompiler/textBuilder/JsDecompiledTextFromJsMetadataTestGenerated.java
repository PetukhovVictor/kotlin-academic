/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.decompiler.textBuilder;

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
@TestMetadata("idea/testData/decompiler/decompiledTextJs")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JsDecompiledTextFromJsMetadataTestGenerated extends AbstractJsDecompiledTextFromJsMetadataTest {
    public void testAllFilesPresentInDecompiledTextJs() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/decompiler/decompiledTextJs"), Pattern.compile("^([^\\.]+)$"), TargetBackend.JS, true);
    }

    @TestMetadata("TestPackage")
    public void testTestPackage() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledTextJs/TestPackage/");
        doTest(fileName);
    }

    @TestMetadata("TypeAliases")
    public void testTypeAliases() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/decompiledTextJs/TypeAliases/");
        doTest(fileName);
    }
}
