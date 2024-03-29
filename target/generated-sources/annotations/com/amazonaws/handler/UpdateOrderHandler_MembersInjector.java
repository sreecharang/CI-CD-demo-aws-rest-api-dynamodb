package com.amazonaws.handler;

import com.amazonaws.dao.OrderDao;
import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpdateOrderHandler_MembersInjector
    implements MembersInjector<UpdateOrderHandler> {
  private final Provider<ObjectMapper> objectMapperProvider;

  private final Provider<OrderDao> orderDaoProvider;

  public UpdateOrderHandler_MembersInjector(
      Provider<ObjectMapper> objectMapperProvider, Provider<OrderDao> orderDaoProvider) {
    this.objectMapperProvider = objectMapperProvider;
    this.orderDaoProvider = orderDaoProvider;
  }

  public static MembersInjector<UpdateOrderHandler> create(
      Provider<ObjectMapper> objectMapperProvider, Provider<OrderDao> orderDaoProvider) {
    return new UpdateOrderHandler_MembersInjector(objectMapperProvider, orderDaoProvider);
  }

  @Override
  public void injectMembers(UpdateOrderHandler instance) {
    injectObjectMapper(instance, objectMapperProvider.get());
    injectOrderDao(instance, orderDaoProvider.get());
  }

  public static void injectObjectMapper(UpdateOrderHandler instance, ObjectMapper objectMapper) {
    instance.objectMapper = objectMapper;
  }

  public static void injectOrderDao(UpdateOrderHandler instance, OrderDao orderDao) {
    instance.orderDao = orderDao;
  }
}
