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

void testCheckPrimeNumber1(void) {
  TEST_ASSERT_TRUE(checkPrimeNumber(13));
}

void testCheckPrimeNumber2(void) {
  TEST_ASSERT_TRUE(checkPrimeNumber(29));
}

void testCheckPrimeNumber3(void) {
  TEST_ASSERT_FALSE(checkPrimeNumber(10));
}

void testCheckPrimeNumber4(void) {
  TEST_ASSERT_FALSE(checkPrimeNumber(100));
}

void testCheckPrimeNumber5(void) {
  TEST_ASSERT_FALSE(checkPrimeNumber(4));
}

void testCheckPrimeNumber6(void) {
  TEST_ASSERT_FALSE(checkPrimeNumber(9));
}

void testCountPrimeNumbersInRange1(void) {
  TEST_ASSERT_EQUAL(5, countPrimeNumbersInRange(1, 10));
}

void testCountPrimeNumbersInRange2(void) {
  TEST_ASSERT_EQUAL(4, countPrimeNumbersInRange(10, 20));
}

void testCountPrimeNumbersInRange3(void) {
  TEST_ASSERT_EQUAL(21, countPrimeNumbersInRange(10, 100));
}

void testCountPrimeNumbersInRange4(void) {
  TEST_ASSERT_EQUAL(143, countPrimeNumbersInRange(100, 1000));
}

int main(void) {
  UNITY_BEGIN();
  RUN_TEST(testCheckPrimeNumber1);
  RUN_TEST(testCheckPrimeNumber2);
  RUN_TEST(testCheckPrimeNumber3);
  RUN_TEST(testCheckPrimeNumber4);
  RUN_TEST(testCheckPrimeNumber5);
  RUN_TEST(testCheckPrimeNumber6);
  RUN_TEST(testCountPrimeNumbersInRange1);
  RUN_TEST(testCountPrimeNumbersInRange2);
  RUN_TEST(testCountPrimeNumbersInRange3);
  RUN_TEST(testCountPrimeNumbersInRange4);
  return UNITY_END();
}
