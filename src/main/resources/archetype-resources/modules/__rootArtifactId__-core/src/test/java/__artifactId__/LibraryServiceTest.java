#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId};

import static org.assertj.${artifactId}.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LibraryServiceTest {

  @Test
  void test() {
    LibraryService sut = new LibraryService();
    assertThat(sut.operate("hello")).as("operate hello").isEqualTo("hello!");
  }
}
