package com.amazonaws.config;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OrderModule_TableNameFactory implements Factory<String> {
  private final OrderModule module;

  public OrderModule_TableNameFactory(OrderModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideInstance(module);
  }

  public static String provideInstance(OrderModule module) {
    return proxyTableName(module);
  }

  public static OrderModule_TableNameFactory create(OrderModule module) {
    return new OrderModule_TableNameFactory(module);
  }

  public static String proxyTableName(OrderModule instance) {
    return Preconditions.checkNotNull(
        instance.tableName(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
