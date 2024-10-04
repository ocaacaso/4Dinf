#include "functions.h"
#include "unity/unity.h"

void setUp(void) {
    // set stuff up here
}

void tearDown(void) {
    // clean stuff up here
}

void test1(void) {
  int src[] = { 1, 2, 3, 4, 5 };
  int dst[5];
  int expected[] = { 2, 3, 4, 5, 1};
  leftShift(src, dst, 5);
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, dst, 5);
}

void test2(void) {
  int src[] = { 1, 2, 3, 4, 5 };
  int expected[] = { 2, 3, 4, 5, 1};
  leftShiftInPlace(src, 5);
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, src, 5);
}

void test3(void) {
  int src[] = { 1, 2, 3, 4, 5 };
  int dst[5];
  int expected[] = { 5, 1, 2, 3, 4 };
  rightShift(src, dst, 5);
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, dst, 5);
}

void test4(void) {
  int src[] = { 1, 2, 3, 4, 5 };
  int expected[] = { 5, 1, 2, 3, 4 };
  rightShiftInPlace(src, 5);
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, src, 5);
}

int main(void) {
  UNITY_BEGIN();
  RUN_TEST(test1);
  RUN_TEST(test2);
  RUN_TEST(test3);
  RUN_TEST(test4);
  return UNITY_END();
}
