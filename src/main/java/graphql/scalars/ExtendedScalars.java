package graphql.scalars;

import graphql.PublicApi;
import graphql.scalars.datetime.DateTimeScalar;
import graphql.scalars.datetime.DateScalar;
import graphql.scalars.datetime.TimeScalar;
import graphql.scalars.numeric.NegativeFloatScalar;
import graphql.scalars.numeric.NegativeIntScalar;
import graphql.scalars.numeric.NonNegativeFloatScalar;
import graphql.scalars.numeric.NonNegativeIntScalar;
import graphql.scalars.numeric.NonPositiveFloatScalar;
import graphql.scalars.numeric.NonPositiveIntScalar;
import graphql.scalars.numeric.PositiveFloatScalar;
import graphql.scalars.numeric.PositiveIntScalar;
import graphql.scalars.object.JsonScalar;
import graphql.scalars.object.ObjectScalar;
import graphql.scalars.url.UrlScalar;
import graphql.schema.GraphQLScalarType;

@PublicApi
public class ExtendedScalars {


    public static GraphQLScalarType DateTime = new DateTimeScalar();
    public static GraphQLScalarType Date = new DateScalar();
    public static GraphQLScalarType Time = new TimeScalar();

    /**
     * An object scalar allows you to have a multi level data value without defining it in the graphql schema.
     * <p>
     * It might be useful when you have opaque data coming from a backend system that you want to pass on
     * but cant provide the actual graphql schema definition for.
     * <p>
     * <b>Use this with caution</b> since is breaks one of the key benefits
     * of graphql, which is that a schema describes the shape of the data that can be queried.
     *
     * <p>
     * This can be declared as follows :
     * <pre>
     * {@code
     *
     * type Customer {
     *      name : String
     *      backendDetails : Object
     * }
     * }
     * </pre>
     *
     * @see #Json
     */
    public static GraphQLScalarType Object = new ObjectScalar();

    /**
     * A synonym class for the {@link #Object} scalar, since some people prefer their SDL to look like the following :
     *
     * <pre>
     * {@code
     *
     * type Customer {
     *      name : String
     *      backendDetails : JSON
     * }
     * }
     * </pre>
     */
    public static GraphQLScalarType Json = new JsonScalar();

    public static GraphQLScalarType Url = new UrlScalar();

    public static GraphQLScalarType PositiveInt = new PositiveIntScalar();
    public static GraphQLScalarType NegativeInt = new NegativeIntScalar();
    public static GraphQLScalarType NonPositiveInt = new NonPositiveIntScalar();
    public static GraphQLScalarType NonNegativeInt = new NonNegativeIntScalar();

    public static GraphQLScalarType PositiveFloat = new PositiveFloatScalar();
    public static GraphQLScalarType NegativeFloat = new NegativeFloatScalar();
    public static GraphQLScalarType NonPositiveFloat = new NonPositiveFloatScalar();
    public static GraphQLScalarType NonNegativeFloat = new NonNegativeFloatScalar();


}