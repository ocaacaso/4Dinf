#include "functions.h"
#include "unity/unity.h"

void setUp(void) {
    // set stuff up here
}

void tearDown(void) {
    // clean stuff up here
}

void testEs7(void) {
  int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  TEST_ASSERT_EQUAL(6, es7(a, 10, 4, 9));
}

void testEs8(void) {
  int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  TEST_ASSERT_EQUAL(4, es8(a, 10, 4, 9));
}

void testEs9(void) {
  int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  TEST_ASSERT_EQUAL(6, es9(a, 10, 3, 5, 7, 9));
}

void testEs10(void) {
  int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  TEST_ASSERT_EQUAL(4, es10(a, 10, 3, 5, 7, 9));
}

// not needed when using generate_test_runner.rb
int main(void) {
  UNITY_BEGIN();
  RUN_TEST(testEs7);
  RUN_TEST(testEs8);
  RUN_TEST(testEs9);
  RUN_TEST(testEs10);
  return UNITY_END();
}