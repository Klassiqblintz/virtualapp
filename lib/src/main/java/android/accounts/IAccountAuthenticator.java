// Auto-generated stub from AIDL: lib/src/main/aidl/android/accounts/IAccountAuthenticator.aidl
package android.accounts;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/**
 * Stub interface for IAccountAuthenticator.
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.
 */
public interface IAccountAuthenticator extends IInterface {
    /** Local class (Binder subclass) */
    public static abstract class Stub extends android.os.Binder implements IAccountAuthenticator {
        private static final String DESCRIPTOR = "android.accounts.IAccountAuthenticator";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IAccountAuthenticator asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IAccountAuthenticator) {
                return (IAccountAuthenticator) iface;
            }
            return new Proxy(obj);
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws android.os.RemoteException {
            switch (code) {
                case INTERFACE_TRANSACTION:
                    reply.writeString(DESCRIPTOR);
                    return true;
                case NEEDS_DEFAULT_TRANSACTION:
                    return onTransact(code, data, reply, flags);
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        public static class Proxy implements IAccountAuthenticator {
            private IBinder mRemote;

            public Proxy(IBinder remote) {
                mRemote = remote;
            }

            @Override
            public IBinder asBinder() {
                return mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }
            /*
             * Copyright (C) 2009 The Android Open Source Project
             *
             * Licensed under the Apache License, Version 2.0 (the "License");
             * you may not use this file except in compliance with the License.
             * You may obtain a copy of the License at
             *
             *      http://www.apache.org/licenses/LICENSE-2.0
             *
             * Unless required by applicable law or agreed to in writing, software
             * distributed under the License is distributed on an "AS IS" BASIS,
             * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
             * See the License for the specific language governing permissions and
             * limitations under the License.
             */
            
            package android.accounts;
            
            
            /**
             * Service that allows the interaction with an authentication server.
             * @hide
             */
                /**
                 * prompts the user for account information and adds the result to the IAccountManager
                 */
                void addAccount(in IAccountAuthenticatorResponse response, String accountType,
                    String authTokenType, in String[] requiredFeatures, in Bundle options);
            
                /**
                 * prompts the user for the credentials of the account
                 */
                void confirmCredentials(in IAccountAuthenticatorResponse response, in Account account,
                    in Bundle options);
            
                /**
                 * gets the password by either prompting the user or querying the IAccountManager
                 */
                void getAuthToken(in IAccountAuthenticatorResponse response, in Account account,
                    String authTokenType, in Bundle options);
            
                /**
                 * Gets the user-visible label of the given authtoken type.
                 */
                void getAuthTokenLabel(in IAccountAuthenticatorResponse response, String authTokenType);
            
                /**
                 * prompts the user for a new password and writes it to the IAccountManager
                 */
                void updateCredentials(in IAccountAuthenticatorResponse response, in Account account,
                    String authTokenType, in Bundle options);
            
                /**
                 * launches an activity that lets the user edit and set the properties for an authenticator
                 */
                void editProperties(in IAccountAuthenticatorResponse response, String accountType);
            
                /**
                 * returns a Bundle where the boolean value BOOLEAN_RESULT_KEY is set if the account has the
                 * specified features
                 */
                void hasFeatures(in IAccountAuthenticatorResponse response, in Account account, 
                    in String[] features);
            
                /**
                 * Gets whether or not the account is allowed to be removed.
                 */
                void getAccountRemovalAllowed(in IAccountAuthenticatorResponse response, in Account account);
            
                /**
                 * Returns a Bundle containing the required credentials to copy the account across users.
                 */
                void getAccountCredentialsForCloning(in IAccountAuthenticatorResponse response,
                        in Account account);
            
                /**
                 * Uses the Bundle containing credentials from another instance of the authenticator to create
                 * a copy of the account on this user.
                 */
                void addAccountFromCredentials(in IAccountAuthenticatorResponse response, in Account account,
                        in Bundle accountCredentials);
            ;

            @Override
            public void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw) {
            }
        }
    }
}
