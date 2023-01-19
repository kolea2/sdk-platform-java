/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Client Libraries Showcase API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= ComplianceClient =======================
 *
 * <p>Service Description: This service is used to test that GAPICs implement various REST-related
 * features correctly. This mostly means transcoding proto3 requests to REST format correctly for
 * various types of HTTP annotations, but it also includes verifying that unknown (numeric) enums
 * received by clients can be round-tripped correctly.
 *
 * <p>Sample for ComplianceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ComplianceClient complianceClient = ComplianceClient.create()) {
 *   RepeatRequest request =
 *       RepeatRequest.newBuilder()
 *           .setName("name3373707")
 *           .setInfo(ComplianceData.newBuilder().build())
 *           .setServerVerify(true)
 *           .setIntendedBindingUri("intendedBindingUri780142386")
 *           .setFInt32(-1143775883)
 *           .setFInt64(-1143775788)
 *           .setFDouble(-1239459382)
 *           .setPInt32(-858673665)
 *           .setPInt64(-858673570)
 *           .setPDouble(-991225216)
 *           .build();
 *   RepeatResponse response = complianceClient.repeatDataBody(request);
 * }
 * }</pre>
 *
 * <p>======================= EchoClient =======================
 *
 * <p>Service Description: This service is used showcase the four main types of rpcs - unary, server
 * side streaming, client side streaming, and bidirectional streaming. This service also exposes
 * methods that explicitly implement server delay, and paginated calls. Set the 'showcase-trailer'
 * metadata key on any method to have the values echoed in the response trailers. Set the
 * 'x-goog-request-params' metadata key on any method to have the values echoed in the response
 * headers.
 *
 * <p>Sample for EchoClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (EchoClient echoClient = EchoClient.create()) {
 *   EchoRequest request =
 *       EchoRequest.newBuilder()
 *           .setSeverity(Severity.forNumber(0))
 *           .setHeader("header-1221270899")
 *           .setOtherHeader("otherHeader-2026585667")
 *           .build();
 *   EchoResponse response = echoClient.echo(request);
 * }
 * }</pre>
 *
 * <p>======================= IdentityClient =======================
 *
 * <p>Service Description: A simple identity service.
 *
 * <p>Sample for IdentityClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (IdentityClient identityClient = IdentityClient.create()) {
 *   String displayName = "displayName1714148973";
 *   String email = "email96619420";
 *   User response = identityClient.createUser(displayName, email);
 * }
 * }</pre>
 *
 * <p>======================= MessagingClient =======================
 *
 * <p>Service Description: A simple messaging service that implements chat rooms and profile posts.
 *
 * <p>This messaging service showcases the features that API clients generated by gapic-generators
 * implement.
 *
 * <p>Sample for MessagingClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (MessagingClient messagingClient = MessagingClient.create()) {
 *   String displayName = "displayName1714148973";
 *   String description = "description-1724546052";
 *   Room response = messagingClient.createRoom(displayName, description);
 * }
 * }</pre>
 *
 * <p>======================= SequenceServiceClient =======================
 *
 * <p>Sample for SequenceServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (SequenceServiceClient sequenceServiceClient = SequenceServiceClient.create()) {
 *   Sequence sequence = Sequence.newBuilder().build();
 *   Sequence response = sequenceServiceClient.createSequence(sequence);
 * }
 * }</pre>
 *
 * <p>======================= TestingClient =======================
 *
 * <p>Service Description: A service to facilitate running discrete sets of tests against Showcase.
 *
 * <p>Sample for TestingClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (TestingClient testingClient = TestingClient.create()) {
 *   CreateSessionRequest request =
 *       CreateSessionRequest.newBuilder().setSession(Session.newBuilder().build()).build();
 *   Session response = testingClient.createSession(request);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.showcase.v1beta1;

import javax.annotation.Generated;