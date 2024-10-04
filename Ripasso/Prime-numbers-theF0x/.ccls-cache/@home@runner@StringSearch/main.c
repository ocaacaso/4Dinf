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

void testContains1(void) {
  char s1[] = "Nel mezzo del cammin di nostra vita";
  char s2[] = "mezzo";
  TEST_ASSERT_TRUE(contains(s1, s2, 4));
}

void testContains2(void) {
  char s1[] = "Nel mezzo del cammin di nostra vita";
  char s2[] = "mezzo";
  TEST_ASSERT_FALSE(contains(s1, s2, 3));
}

void testFind1(void) {
  char s1[] = "Nel mezzo del cammin di nostra vita";
  char s2[] = "mezzo";
  TEST_ASSERT_EQUAL(4, find(s1, s2));
}

void testFind2(void) {
  char s1[] = "abcabcd";
  char s2[] = "abcd";
  TEST_ASSERT_EQUAL(3, find(s1, s2));
}

void testFind3(void) {
  char s1[] = "abcabcd";
  char s2[] = "abcde";
  TEST_ASSERT_EQUAL(-1, find(s1, s2));
}

int main(void) {
  UNITY_BEGIN();
  RUN_TEST(testContains1);
  RUN_TEST(testContains2);
  RUN_TEST(testFind1);
  RUN_TEST(testFind2);
  RUN_TEST(testFind3);
  return UNITY_END();
}
