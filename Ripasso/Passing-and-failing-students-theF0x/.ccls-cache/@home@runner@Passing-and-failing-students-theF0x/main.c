#include "functions.h"
#include "unity/unity.h"

void setUp(void) {
    // set stuff up here
}

void tearDown(void) {
    // clean stuff up here
}

void testCountFailingStudents1(void) {
  int grades[MAX][MAX] = { { 6, 7, 5, 3, 8 },
                         { 6, 6, 7, 8, 9 },
                         { 6, 6, 6, 7, 5 },
                         { 6, 7, 8, 7, 8 } };

  int s = 4;
  int g = 5;

  int c = countFailingStudents(grades, s, g);
  
  TEST_ASSERT_EQUAL(2, c);
}

void testCountFailingStudents2(void) {
  int grades[MAX][MAX] = { { 6, 2, 5, 3, 8 },
                         { 6, 6, 4, 8, 9 },
                         { 6, 6, 6, 7, 5 },
                         { 6, 6, 6, 6, 6 },
                         { 6, 7, 5, 7, 8 } };

  int s = 5;
  int g = 5;

  int c = countFailingStudents(grades, s, g);
  
  TEST_ASSERT_EQUAL(4, c);
}

void testCountEasySubjects1(void) {
  int grades[MAX][MAX] = { { 6, 7, 5, 3, 8 },
                           { 6, 6, 7, 8, 9 },
                           { 6, 6, 6, 7, 5 },
                           { 6, 7, 8, 7, 8 } };
  
  int s = 4;
  int g = 5;

  int c = countEasySubjects(grades, s, g);
  
  TEST_ASSERT_EQUAL(2, c);
}

void testCountEasySubjects2(void) {
  int grades[MAX][MAX] = { { 6, 7, 5, 3, 8 },
                           { 5, 6, 7, 8, 9 },
                           { 6, 6, 7, 8, 9 },
                           { 6, 6, 6, 7, 5 },
                           { 6, 7, 8, 7, 8 } };
  
  int s = 5;
  int g = 5;

  int c = countEasySubjects(grades, s, g);
  
  TEST_ASSERT_EQUAL(1, c);
}

void testCopyFailedSubjectsPerStudent1(void) {
  int grades[MAX][MAX] = { { 6, 7, 5, 3, 8 },
                           { 6, 6, 7, 8, 9 },
                           { 6, 6, 6, 7, 5 },
                           { 6, 7, 8, 7, 8 } };
  
  int s = 4;
  int g = 5;

  int students[s];
  int expected[] = { 2, 0, 1, 0 };

  copyFailedSubjectsPerStudent(grades, s, g, students);
  
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, students, s);
}

void testCopyFailedSubjectsPerStudent2(void) {
  int grades[MAX][MAX] = { { 6, 7, 5, 3, 8 },
                           { 6, 6, 7, 8, 9 },
                           { 3, 6, 6, 7, 5 },
                           { 6, 6, 6, 7, 5 },
                           { 6, 7, 8, 7, 8 } };
  
  int s = 5;
  int g = 5;

  int students[s];
  int expected[] = { 2, 0, 2, 1, 0 };

  copyFailedSubjectsPerStudent(grades, s, g, students);
  
  TEST_ASSERT_EQUAL_INT_ARRAY(expected, students, s);
}


int main(void) {
  UNITY_BEGIN();
  RUN_TEST(testCountFailingStudents1);
  RUN_TEST(testCountFailingStudents2);
  RUN_TEST(testCountEasySubjects1);
  RUN_TEST(testCountEasySubjects2);
  RUN_TEST(testCopyFailedSubjectsPerStudent1);
  RUN_TEST(testCopyFailedSubjectsPerStudent2);
  return UNITY_END();
}
