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
  TEST_ASSERT_EQUAL(4, countDivisors());
}

void testContains2(void) {
  char s[] = "Nel mezzo del cammin di nostra vita";
  char c = 'c';
  TEST_ASSERT_TRUE(containsLetter(s, c));
}

void testContains3(void) {
  char s[] = "Nel mezzo del cammin di nostra vita";
  char c = 'q';
  TEST_ASSERT_FALSE(containsLetter(s, c));
}

void testCount1(void) {
  char s1[] = "PIPPO";
  char s2[] = "PIPPICALZELUNGHE";
  TEST_ASSERT_EQUAL(4, countLetters(s1, s2));
}

void testCount2(void) {
  char s1[] = "PIPPICALZELUNGHE";
  char s2[] = "PIPPO";
  TEST_ASSERT_EQUAL(5, countLetters(s1, s2));
}

void testCount3(void) {
  char s1[] = "PIPPIPIPPI";
  char s2[] = "pippo";
  TEST_ASSERT_EQUAL(0, countLetters(s1, s2));
}

int main(void) {
  UNITY_BEGIN();
  RUN_TEST(testContains1);
  RUN_TEST(testContains2);
  RUN_TEST(testContains3);
  RUN_TEST(testCount1);
  RUN_TEST(testCount2);
  RUN_TEST(testCount3);
  return UNITY_END();
}
