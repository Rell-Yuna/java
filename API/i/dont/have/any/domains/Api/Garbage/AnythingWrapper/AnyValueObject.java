package i.dont.have.any.domains.Api.Garbage.AnythingWrapper;
// package i.dont.have.any.domains.Api.AnythingWrapper;

// public class AnyValueObject<T> {

//     final T value;
//     final Calculation<AnyValueObject<T>> addition;
//     final Calculation<AnyValueObject<T>> subtraction;
//     final Calculation<AnyValueObject<T>> multiplication;
//     final Calculation<AnyValueObject<T>> division;
//     final Calculation<AnyValueObject<T>> modulo;

//     private AnyValueObject(final Builder<T> builder) {
//         this.value = builder.value;
//         this.addition = builder.addition;
//         this.subtraction = builder.subtraction;
//         this.multiplication = builder.subtraction;
//         this.division = builder.division;
//         this.modulo = builder.modulo;
//     }

//     public AnyValueObject<T> add(AnyValueObject<T> obj) {
//         return addition.calc(obj , this);
//     }

//     public AnyValueObject<T> sub(AnyValueObject<T> obj) {
//         return subtraction.calc(obj , this);
//     }

//     public AnyValueObject<T> mul(AnyValueObject<T> obj) {
//         return multiplication.calc(obj , this);
//     }

//     public AnyValueObject<T> div(AnyValueObject<T> obj) {
//         return division.calc(obj ,this);
//     }

//     public AnyValueObject<T> mod(AnyValueObject<T> obj) {
//         return modulo.calc(obj,this);
//     }

//     public static class Builder<T> {

//         T value;
//         Calculation<AnyValueObject<T>> addition;
//         Calculation<AnyValueObject<T>> subtraction;
//         Calculation<AnyValueObject<T>> multiplication;
//         Calculation<AnyValueObject<T>> division;
//         Calculation<AnyValueObject<T>> modulo;

//         public Builder() {

//         }

//         public Builder<T> addition(Calculation<AnyValueObject<T>> add) {
//             this.addition = add;
//             return this;
//         }

//         public Builder<T> subtraction(Calculation<AnyValueObject<T>> sub) {
//             this.subtraction = sub;
//             return this;
//         }

//         public Builder<T> multiplication(Calculation<AnyValueObject<T>> multi) {
//             this.multiplication = multi;
//             return this;
//         }

//         public Builder<T> division(Calculation<AnyValueObject<T>> div) {
//             this.division = div;
//             return this;
//         }

//         public Builder<T> modulo(Calculation<AnyValueObject<T>> mod) {
//             this.modulo = mod;
//             return this;
//         }

//         public Builder<T> value(T value) {
//             this.value = value;
//             return this;
//         }

//         public AnyValueObject<T> build() {
//             if (addition == null)
//                 throw new NullPointerException("additionが設定されていません");
//             if (subtraction == null)
//                 throw new NullPointerException("subtractionが設定されていません");
//             if (multiplication == null)
//                 throw new NullPointerException("multiplicationが設定されていません");
//             if (division == null)
//                 throw new NullPointerException("divisionが設定されていません");
//             if (modulo == null)
//                 throw new NullPointerException("moduloが設定されていません");
//             return new AnyValueObject<>(this);
//         }
//     }
// }
