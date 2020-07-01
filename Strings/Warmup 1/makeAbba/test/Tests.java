
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("makeAbba(\"Hi\", \"Bye\") → \"HiByeByeHi\"","HiByeByeHi",task.makeAbba("Hi", "Bye"));
    assertEquals("makeAbba(\"Yo\", \"Alice\") → \"YoAliceAliceYo\"","YoAliceAliceYo",task.makeAbba("Yo", "Alice"));
    assertEquals("makeAbba(\"What\", \"Up\") → \"WhatUpUpWhat\"","WhatUpUpWhat",task.makeAbba("What", "Up"));
    assertEquals("makeAbba(\"aaa\", \"bbb\") → \"aaabbbbbbaaa\"","aaabbbbbbaaa",task.makeAbba("aaa", "bbb"));
    assertEquals("makeAbba(\"x\", \"y\") → \"xyyx\"","xyyx",task.makeAbba("x", "y"));
    assertEquals("makeAbba(\"x\", \"\") → \"xx\"","xx",task.makeAbba("x", ""));
    assertEquals("makeAbba(\"\", \"y\") → \"yy\"","yy",task.makeAbba("", "y"));
    assertEquals("makeAbba(\"Bo\", \"Ya\") → \"BoYaYaBo\"","BoYaYaBo",task.makeAbba("Bo", "Ya"));
    assertEquals("makeAbba(\"Ya\", \"Ya\") → \"YaYaYaYa\"","YaYaYaYa",task.makeAbba("Ya", "Ya"));

  }
}