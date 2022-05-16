package io.substrait.expression;

import io.substrait.function.SimpleExtension;
import java.util.*;

public interface FunctionLookup {
  SimpleExtension.ScalarFunctionVariant getScalarFunction(
      int reference, SimpleExtension.ExtensionCollection extensions);

  SimpleExtension.AggregateFunctionVariant getAggregateFunction(
      int reference, SimpleExtension.ExtensionCollection extensions);
}
