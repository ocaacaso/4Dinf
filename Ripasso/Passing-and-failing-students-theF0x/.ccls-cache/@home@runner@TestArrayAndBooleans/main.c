#include "functions.h"
#include "unity/unity.h"

void setUp(void) {
    // set stuff up here
}

void tearDown(void) {
    // clean stuff up here
}

void test1(void) {
  int a1[] = {1, 2, 3, 4, 5};
  int a2[] = {6, 7, 8};
  int a3[8];
  int expected[] = {1, 2, 3, 4, 5, 6, 7, 8};
  merge(a1, 5, a2, 3, a3);
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, a3, 8);
}
// not needed when using generate_test_runner.rb
int main(void) {
  UNITY_BEGIN();
  RUN_TEST(test1);
  return UNITY_END();
}