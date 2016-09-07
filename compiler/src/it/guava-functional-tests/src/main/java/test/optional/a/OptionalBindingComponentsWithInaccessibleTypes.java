/*
 * Copyright (C) 2016 The Dagger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test.optional.a;

import dagger.Component;
import test.optional.OptionalBindingComponents.ConcreteBindingModule;
import test.optional.OptionalBindingComponents.OptionalBindingModule;
import test.optional.OptionalBindingComponents.SomeQualifier;
import test.optional.OptionalBindingComponents.Values;

final class OptionalBindingComponentsWithInaccessibleTypes {

  interface OptionalBindingComponent {
    Values values();

    @SomeQualifier
    Values qualifiedValues();
  }

  @Component(modules = OptionalBindingModule.class)
  interface AbsentOptionalBindingComponent extends OptionalBindingComponent {}

  @Component(modules = {OptionalBindingModule.class, ConcreteBindingModule.class})
  interface PresentOptionalBindingComponent extends OptionalBindingComponent {}
}