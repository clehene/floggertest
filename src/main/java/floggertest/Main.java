package floggertest;

import com.google.common.flogger.FluentLogger;

public class Main {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  public static void main(String[] args) {

    logger.atInfo().log("test");

  }

}
