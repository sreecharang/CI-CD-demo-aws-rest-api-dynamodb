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
public final class CreateOrderHandler_MembersInjector
    implements MembersInjector<CreateOrderHandler> {
  private final Provider<ObjectMapper> objectMapperProvider;

  private final Provider<OrderDao> orderDaoProvider;

  public CreateOrderHandler_MembersInjector(
      Provider<ObjectMapper> objectMapperProvider, Provider<OrderDao> orderDaoProvider) {
    this.objectMapperProvider = objectMapperProvider;
    this.orderDaoProvider = orderDaoProvider;
  }

  public static MembersInjector<CreateOrderHandler> create(
      Provider<ObjectMapper> objectMapperProvider, Provider<OrderDao> orderDaoProvider) {
    return new CreateOrderHandler_MembersInjector(objectMapperProvider, orderDaoProvider);
  }

  @Override
  public void injectMembers(CreateOrderHandler instance) {
    injectObjectMapper(instance, objectMapperProvider.get());
    injectOrderDao(instance, orderDaoProvider.get());
  }

  public static void injectObjectMapper(CreateOrderHandler instance, ObjectMapper objectMapper) {
    instance.objectMapper = objectMapper;
  }

  public static void injectOrderDao(CreateOrderHandler instance, OrderDao orderDao) {
    instance.orderDao = orderDao;
  }
}
