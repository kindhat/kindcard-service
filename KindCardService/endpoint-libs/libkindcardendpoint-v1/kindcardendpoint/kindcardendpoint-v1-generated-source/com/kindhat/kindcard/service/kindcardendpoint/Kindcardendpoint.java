/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-09-30 at 22:54:07 UTC 
 * Modify at your own risk.
 */

package com.kindhat.kindcard.service.kindcardendpoint;

/**
 * Service definition for Kindcardendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link KindcardendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Kindcardendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the kindcardendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://kind-card-service.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "kindcardendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Kindcardendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Kindcardendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getKindCard".
   *
   * This request holds the parameters needed by the kindcardendpoint server.  After setting any
   * optional parameters, call the {@link GetKindCard#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetKindCard getKindCard(java.lang.Long id) throws java.io.IOException {
    GetKindCard result = new GetKindCard(id);
    initialize(result);
    return result;
  }

  public class GetKindCard extends KindcardendpointRequest<com.kindhat.kindcard.service.kindcardendpoint.model.KindCard> {

    private static final String REST_PATH = "kindcard/{id}";

    /**
     * Create a request for the method "getKindCard".
     *
     * This request holds the parameters needed by the the kindcardendpoint server.  After setting any
     * optional parameters, call the {@link GetKindCard#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetKindCard#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetKindCard(java.lang.Long id) {
      super(Kindcardendpoint.this, "GET", REST_PATH, null, com.kindhat.kindcard.service.kindcardendpoint.model.KindCard.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetKindCard setAlt(java.lang.String alt) {
      return (GetKindCard) super.setAlt(alt);
    }

    @Override
    public GetKindCard setFields(java.lang.String fields) {
      return (GetKindCard) super.setFields(fields);
    }

    @Override
    public GetKindCard setKey(java.lang.String key) {
      return (GetKindCard) super.setKey(key);
    }

    @Override
    public GetKindCard setOauthToken(java.lang.String oauthToken) {
      return (GetKindCard) super.setOauthToken(oauthToken);
    }

    @Override
    public GetKindCard setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetKindCard) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetKindCard setQuotaUser(java.lang.String quotaUser) {
      return (GetKindCard) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetKindCard setUserIp(java.lang.String userIp) {
      return (GetKindCard) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetKindCard setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetKindCard set(String parameterName, Object value) {
      return (GetKindCard) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getKindCardByKindCardId".
   *
   * This request holds the parameters needed by the kindcardendpoint server.  After setting any
   * optional parameters, call the {@link GetKindCardByKindCardId#execute()} method to invoke the
   * remote operation.
   *
   * @param kindCardId
   * @return the request
   */
  public GetKindCardByKindCardId getKindCardByKindCardId(java.lang.String kindCardId) throws java.io.IOException {
    GetKindCardByKindCardId result = new GetKindCardByKindCardId(kindCardId);
    initialize(result);
    return result;
  }

  public class GetKindCardByKindCardId extends KindcardendpointRequest<com.kindhat.kindcard.service.kindcardendpoint.model.KindCard> {

    private static final String REST_PATH = "getByKindCardId/{kindCardId}";

    /**
     * Create a request for the method "getKindCardByKindCardId".
     *
     * This request holds the parameters needed by the the kindcardendpoint server.  After setting any
     * optional parameters, call the {@link GetKindCardByKindCardId#execute()} method to invoke the
     * remote operation. <p> {@link GetKindCardByKindCardId#initialize(com.google.api.client.googleapi
     * s.services.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
     * after invoking the constructor. </p>
     *
     * @param kindCardId
     * @since 1.13
     */
    protected GetKindCardByKindCardId(java.lang.String kindCardId) {
      super(Kindcardendpoint.this, "GET", REST_PATH, null, com.kindhat.kindcard.service.kindcardendpoint.model.KindCard.class);
      this.kindCardId = com.google.api.client.util.Preconditions.checkNotNull(kindCardId, "Required parameter kindCardId must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetKindCardByKindCardId setAlt(java.lang.String alt) {
      return (GetKindCardByKindCardId) super.setAlt(alt);
    }

    @Override
    public GetKindCardByKindCardId setFields(java.lang.String fields) {
      return (GetKindCardByKindCardId) super.setFields(fields);
    }

    @Override
    public GetKindCardByKindCardId setKey(java.lang.String key) {
      return (GetKindCardByKindCardId) super.setKey(key);
    }

    @Override
    public GetKindCardByKindCardId setOauthToken(java.lang.String oauthToken) {
      return (GetKindCardByKindCardId) super.setOauthToken(oauthToken);
    }

    @Override
    public GetKindCardByKindCardId setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetKindCardByKindCardId) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetKindCardByKindCardId setQuotaUser(java.lang.String quotaUser) {
      return (GetKindCardByKindCardId) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetKindCardByKindCardId setUserIp(java.lang.String userIp) {
      return (GetKindCardByKindCardId) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String kindCardId;

    /**

     */
    public java.lang.String getKindCardId() {
      return kindCardId;
    }

    public GetKindCardByKindCardId setKindCardId(java.lang.String kindCardId) {
      this.kindCardId = kindCardId;
      return this;
    }

    @Override
    public GetKindCardByKindCardId set(String parameterName, Object value) {
      return (GetKindCardByKindCardId) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listKindCards".
   *
   * This request holds the parameters needed by the kindcardendpoint server.  After setting any
   * optional parameters, call the {@link ListKindCards#execute()} method to invoke the remote
   * operation.
   *
   * @param cursor
   * @param limit
   * @return the request
   */
  public ListKindCards listKindCards(java.lang.String cursor, java.lang.Integer limit) throws java.io.IOException {
    ListKindCards result = new ListKindCards(cursor, limit);
    initialize(result);
    return result;
  }

  public class ListKindCards extends KindcardendpointRequest<com.kindhat.kindcard.service.kindcardendpoint.model.CollectionResponseKindCard> {

    private static final String REST_PATH = "listKindCards";

    /**
     * Create a request for the method "listKindCards".
     *
     * This request holds the parameters needed by the the kindcardendpoint server.  After setting any
     * optional parameters, call the {@link ListKindCards#execute()} method to invoke the remote
     * operation. <p> {@link ListKindCards#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param cursor
     * @param limit
     * @since 1.13
     */
    protected ListKindCards(java.lang.String cursor, java.lang.Integer limit) {
      super(Kindcardendpoint.this, "GET", REST_PATH, null, com.kindhat.kindcard.service.kindcardendpoint.model.CollectionResponseKindCard.class);
      this.cursor = com.google.api.client.util.Preconditions.checkNotNull(cursor, "Required parameter cursor must be specified.");
      this.limit = com.google.api.client.util.Preconditions.checkNotNull(limit, "Required parameter limit must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListKindCards setAlt(java.lang.String alt) {
      return (ListKindCards) super.setAlt(alt);
    }

    @Override
    public ListKindCards setFields(java.lang.String fields) {
      return (ListKindCards) super.setFields(fields);
    }

    @Override
    public ListKindCards setKey(java.lang.String key) {
      return (ListKindCards) super.setKey(key);
    }

    @Override
    public ListKindCards setOauthToken(java.lang.String oauthToken) {
      return (ListKindCards) super.setOauthToken(oauthToken);
    }

    @Override
    public ListKindCards setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListKindCards) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListKindCards setQuotaUser(java.lang.String quotaUser) {
      return (ListKindCards) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListKindCards setUserIp(java.lang.String userIp) {
      return (ListKindCards) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListKindCards setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListKindCards setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListKindCards set(String parameterName, Object value) {
      return (ListKindCards) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateKindCard".
   *
   * This request holds the parameters needed by the kindcardendpoint server.  After setting any
   * optional parameters, call the {@link UpdateKindCard#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.kindhat.kindcard.service.kindcardendpoint.model.KindCard}
   * @return the request
   */
  public UpdateKindCard updateKindCard(com.kindhat.kindcard.service.kindcardendpoint.model.KindCard content) throws java.io.IOException {
    UpdateKindCard result = new UpdateKindCard(content);
    initialize(result);
    return result;
  }

  public class UpdateKindCard extends KindcardendpointRequest<com.kindhat.kindcard.service.kindcardendpoint.model.KindCard> {

    private static final String REST_PATH = "kindcard";

    /**
     * Create a request for the method "updateKindCard".
     *
     * This request holds the parameters needed by the the kindcardendpoint server.  After setting any
     * optional parameters, call the {@link UpdateKindCard#execute()} method to invoke the remote
     * operation. <p> {@link UpdateKindCard#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.kindhat.kindcard.service.kindcardendpoint.model.KindCard}
     * @since 1.13
     */
    protected UpdateKindCard(com.kindhat.kindcard.service.kindcardendpoint.model.KindCard content) {
      super(Kindcardendpoint.this, "PUT", REST_PATH, content, com.kindhat.kindcard.service.kindcardendpoint.model.KindCard.class);
    }

    @Override
    public UpdateKindCard setAlt(java.lang.String alt) {
      return (UpdateKindCard) super.setAlt(alt);
    }

    @Override
    public UpdateKindCard setFields(java.lang.String fields) {
      return (UpdateKindCard) super.setFields(fields);
    }

    @Override
    public UpdateKindCard setKey(java.lang.String key) {
      return (UpdateKindCard) super.setKey(key);
    }

    @Override
    public UpdateKindCard setOauthToken(java.lang.String oauthToken) {
      return (UpdateKindCard) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateKindCard setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateKindCard) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateKindCard setQuotaUser(java.lang.String quotaUser) {
      return (UpdateKindCard) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateKindCard setUserIp(java.lang.String userIp) {
      return (UpdateKindCard) super.setUserIp(userIp);
    }

    @Override
    public UpdateKindCard set(String parameterName, Object value) {
      return (UpdateKindCard) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Kindcardendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Kindcardendpoint}. */
    @Override
    public Kindcardendpoint build() {
      return new Kindcardendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link KindcardendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setKindcardendpointRequestInitializer(
        KindcardendpointRequestInitializer kindcardendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(kindcardendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
