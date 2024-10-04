#include "unity/unity.h"
#include "functions.h"

void setUp(void) {
    // set stuff up here
}

void tearDown(void) {
    // clean stuff up here
}

void testEs7(void) {
  int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int b[] = {1, 2, 3};
  TEST_ASSERT_EQUAL_INT8_ARRAY(a, b, 3);
  int c[] = {1, 2, 3};
  TEST_ASSERT_EQUAL_INT_ARRAY(a, c, 3);
}

// not needed when using generate_test_runner.rb
int main(void) {
  printf("%f", distance(3.2, 3.5, 4.7, 3.9));
  UNITY_BEGIN();
  RUN_TEST(test_function_should_doBlahAndBlah);
  RUN_TEST(test_function_should_doAlsoDoBlah);
  RUN_TEST(test_array);
  RUN_TEST(testDistance);
  return UNITY_END();
}