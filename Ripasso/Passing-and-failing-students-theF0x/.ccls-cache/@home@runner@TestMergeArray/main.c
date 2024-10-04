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

void test2(void) {
  int a1[] = {1, 2, 3, 4, 5};
  int a2[] = {6, 7, 8};
  int a3[8];
  int expected[] = {1, 2, 3, 4, 5, 6, 7, 8};
  merge(a2, 3, a1, 5, a3);
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, a3, 8);
}

void test3(void) {
  int a1[] = {1, 3, 5, 7};
  int a2[] = {2, 4, 6 };
  int a3[7];
  int expected[] = {1, 2, 3, 4, 5, 6, 7};
  merge(a1, 4, a2, 3, a3);
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, a3, 7);
}

void test4(void) {
  int a1[] = {1, 3, 5, 7};
  int a2[] = {2, 4, 6 };
  int a3[7];
  int expected[] = {1, 2, 3, 4, 5, 6, 7};
  merge(a2, 3, a1, 4, a3);
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, a3, 7);
}

void test5(void) {
  int a1[] = { 1, 3, 4, 6 };
  int a2[] = { 3, 4, 5 };
  int a3[7];
  int expected[] = { 1, 3, 3, 4, 4, 5, 6 };
  merge(a1, 4, a2, 3, a3);
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, a3, 7);
}

void test6(void) {
  int a1[] = { 1, 3, 4, 6 };
  int a2[] = { 3, 4, 5 };
  int a3[7];
  int expected[] = { 1, 3, 3, 4, 4, 5, 6 };
  merge(a2, 3, a1, 4, a3);
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, a3, 7);
}

int main(void) {
  UNITY_BEGIN();
  RUN_TEST(test1);
  RUN_TEST(test2);
  RUN_TEST(test3);
  RUN_TEST(test4);
  RUN_TEST(test5);
  RUN_TEST(test6);
  return UNITY_END();
}
