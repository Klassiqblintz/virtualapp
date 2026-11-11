// Auto-generated stub from AIDL: lib/src/main/aidl/com/lody/virtual/server/IAccountManager.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;

public interface IAccountManager extends IInterface {
    public static abstract class Stub extends android.os.Binder implements IAccountManager {
        private static final String DESCRIPTOR = "com.lody.virtual.server.IAccountManager";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IAccountManager asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IAccountManager) {
                return (IAccountManager) iface;
            }
            return new Proxy(obj);
        }

        @Override
        public IBinder asBinder() { return this; }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            switch (code) {
                case android.os.IBinder.INTERFACE_TRANSACTION:
                    reply.writeString(DESCRIPTOR);
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        public static class Proxy implements IAccountManager {
            private IBinder mRemote;
            public Proxy(IBinder remote) { mRemote = remote; }
            @Override public IBinder asBinder() { return mRemote; }
            public String getInterfaceDescriptor() { return DESCRIPTOR; }
        package com.lody.virtual.server
        
        
        
        /**
         * Central application service that provides account management.
         * @hide
         */
            AuthenticatorDescription[] getAuthenticatorTypes(int userId)
            void getAccountsByFeatures(int userId, in IAccountManagerResponse response, in String type, in String[] features)
            String getPreviousName(int userId, in Account account)
            Account[] getAccounts(int userId, in String type)
            void getAuthToken(int userId, in IAccountManagerResponse response, in Account account, in String authTokenType, in boolean notifyOnAuthFailure, in boolean expectActivityLaunch, in Bundle loginOptions)
            void setPassword(int userId, in Account account, in String password)
            void setAuthToken(int userId, in Account account, in String authTokenType, in String authToken)
            void setUserData(int userId, in Account account, in String key, in String value)
            void hasFeatures(int userId, in IAccountManagerResponse response,
            							in Account account, in String[] features)
            void updateCredentials(int userId, in IAccountManagerResponse response, in Account account,
            								  in String authTokenType, in boolean expectActivityLaunch,
            								  in Bundle loginOptions)
            void editProperties(int userId, in IAccountManagerResponse response, in String accountType,
            							   in boolean expectActivityLaunch)
            void getAuthTokenLabel(int userId, in IAccountManagerResponse response, in String accountType,
            								  in String authTokenType)
            String getUserData(int userId, in Account account, in String key)
            String getPassword(int userId, in Account account)
            void confirmCredentials(int userId, in IAccountManagerResponse response, in Account account, in Bundle options, in boolean expectActivityLaunch)
            void addAccount(int userId, in IAccountManagerResponse response, in String accountType,
            						   in String authTokenType, in String[] requiredFeatures,
            						   in boolean expectActivityLaunch, in Bundle optionsIn)
            boolean addAccountExplicitly(int userId, in Account account, in String password, in Bundle extras)
            boolean removeAccountExplicitly(int userId, in Account account)
            void renameAccount(int userId, in IAccountManagerResponse response, in Account accountToRename, in String newName)
            void removeAccount(in int userId, in IAccountManagerResponse response, in Account account,
            							  in boolean expectActivityLaunch)
            void clearPassword(int userId, in Account account)
            boolean accountAuthenticated(int userId, in Account account)
            void invalidateAuthToken(int userId, in String accountType, in String authToken)
            String peekAuthToken(int userId, in Account account, in String authTokenType)
        
        
        }
    }
}
