#include <stdio.h>
#include "unity/unity.h"

void setUp(void) {
    // set stuff up here
}

void tearDown(void) {
    // clean stuff up here
}

void test_function_should_doBlahAndBlah(void) {
  TEST_ASSERT_EQUAL(3, func1());
}

void test_array(void) {
  int a[] = {1, 2, 3};
  int b[] = {1, 2, 3};
  TEST_ASSERT_EQUAL_INT8_ARRAY(a, b, 3);
  int c[] = {1, 2, 3};
  TEST_ASSERT_EQUAL_INT_ARRAY(a, c, 3);
}

void test_function_should_doAlsoDoBlah(void) {
  TEST_ASSERT_NOT_EQUAL(0, func1());
}

void testDistance(void) {
  TEST_ASSERT_FLOAT_WITHIN(0, 1.55241, distance(3.2, 3.5, 4.7, 3.9));
}
