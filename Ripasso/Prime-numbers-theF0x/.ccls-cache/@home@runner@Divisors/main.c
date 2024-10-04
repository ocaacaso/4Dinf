#include <stdio.h>
#include <stdbool.h>
#include "functions.h"
#include "unity/unity.h"

void setUp(void) {
    // set stuff up here
}

void tearDown(void) {
    // clean stuff up here
}

void test1(void) {
  TEST_ASSERT_EQUAL(0, countDivisors(3));
}

void test2(void) {
  TEST_ASSERT_EQUAL(0, countDivisors(11));
}

void test3(void) {
  TEST_ASSERT_EQUAL(2, countDivisors(10));
}

void test4(void) {
  TEST_ASSERT_EQUAL(4, countDivisors(50));
}

void test5(void) {
  TEST_ASSERT_EQUAL(7, countDivisors(100));
}

int main(void) {
  UNITY_BEGIN();
  RUN_TEST(test1);
  RUN_TEST(test2);
  RUN_TEST(test3);
  RUN_TEST(test4);
  RUN_TEST(test5);
  return UNITY_END();
}
