package io.quarkus.gradle;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.io.File;

import org.junit.jupiter.api.Test;

public class AnnotationProcessorSimpleModuleTest extends QuarkusGradleWrapperTestBase {

    @Test
    public void shouldRunTestCorrectly() throws Exception {
        final File projectDir = getProjectDir("annotation-processor-simple-module");

        BuildResult buildResult = runGradleWrapper(projectDir, "clean", "test");

        assertThat(buildResult.getTasks().get(":test")).isEqualTo(BuildResult.SUCCESS_OUTCOME);
    }
}
