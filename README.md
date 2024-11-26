When using a MUnit test inside a [helper function](https://scalameta.org/munit/docs/tests.html#declare-tests-inside-a-helper-function) that lives in a different file than the FunSuite subtype, the error output is very unhelpful.

MySuite:
+ this works 0.005s
  ==> X MySuite.this fails  0.021s munit.ComparisonFailException: /home/augustnagro/prog/test-projects/munit-helper-bad-trace/src/test/scala/MySuite.scala:4
  3:class MySuite extends munit.FunSuite {
  4:  mySharedTest(this, "Postgres")
  5:}
  values are not the same
  => Obtained
  abc
  => Diff (- obtained, + expected)
  -abc
  +abd
  at munit.Assertions.failComparison(Assertions.scala:278)
  [error] Failed: Total 2, Failed 1, Errors 0, Passed 1
  [error] Failed tests:
  [error] 	MySuite
  [error] (Test / test) sbt.TestsFailedException: Tests unsuccessful
  [error] Total time: 1 s, completed Nov 26, 2024, 12:09:19 AM
