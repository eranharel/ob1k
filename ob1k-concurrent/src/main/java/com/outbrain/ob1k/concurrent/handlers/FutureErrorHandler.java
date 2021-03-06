package com.outbrain.ob1k.concurrent.handlers;

import com.outbrain.ob1k.concurrent.ComposableFuture;

import java.util.concurrent.ExecutionException;

/**
 * User: aronen
 * Date: 11/3/13
 * Time: 2:32 PM
 */
public interface FutureErrorHandler<R> {
  public ComposableFuture<R> handle(Throwable error);
}
