# 木島 テスト研修 課題２

E2E test in scala.

## コードはこちら
[src/test/scala/Juice](http://gitlab.geniee.jp/yutaro-kijima/test-plactice2/blob/master/src/test/scala/Juice.scala)

## requirements

- chromedriver
- sbt


## テスト項目

- タイトルが `OWASP Juice Shop` である
- スコアボードにアクセスできる(初回アクセスに成功している場合)

## 実行結果

```sbtshell
[info] JuiceSpec:
[info] title
[info] - should OWASP Juice Shop
[info] スコアボード
[info] - should みれる
[info] Run completed in 8 seconds, 196 milliseconds.
[info] Total number of tests run: 2
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 2, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 9 s, completed 2019/05/09 16:21:18
```
