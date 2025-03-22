package com.github.boniface

import wvlet.log.Logger

@main
def main(): Unit =
   val logger = Logger.of[main]
    logger.debug("This is a debug message")
    logger.trace("This is a trace message")
    logger.error("This is an error message")
    logger.warn("This is a warning message")
    logger.info("This is an info message")

