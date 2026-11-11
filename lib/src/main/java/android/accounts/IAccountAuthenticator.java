// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/android/accounts/IAccountAuthenticator.aidl
package android.accounts;

import android.os.IBinder;
import android.os.IInterface;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.Account;
import android.os.Bundle;

/**
 * Stub interface for IAccountAuthenticator.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IAccountAuthenticator.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IAccountAuthenticator.java {
 private static final String DESCRIPTOR = "android.accounts.IAccountAuthenticator.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IAccountAuthenticator.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IAccountAuthenticator.java) {
 return (IAccountAuthenticator.java) iface;
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

 public static class Proxy implements IAccountAuthenticator.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 /** * prompts the user for account information and adds the result to the IAccountManager */ void addAccount( IAccountAuthenticatorResponse response, String accountType, String authTokenType, String[] requiredFeatures, Bundle options);
 /** * prompts the user for the credentials of the account */ void confirmCredentials( IAccountAuthenticatorResponse response, Account account, Bundle options);
 /** * gets the password by either prompting the user or querying the IAccountManager */ void getAuthToken( IAccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options);
 /** * Gets the user-visible label of the given authtoken type. */ void getAuthTokenLabel( IAccountAuthenticatorResponse response, String authTokenType);
 /** * prompts the user for a new password and writes it to the IAccountManager */ void updateCredentials( IAccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options);
 /** * launches an activity that lets the user edit and set the properties for an authenticator */ void editProperties( IAccountAuthenticatorResponse response, String accountType);
 /** * returns a Bundle where the boolean value BOOLEAN_RESULT_KEY is set if the account has the * specified features */ void hasFeatures( IAccountAuthenticatorResponse response, Account account, String[] features);
 /** * Gets whether or not the account is allowed to be removed. */ void getAccountRemovalAllowed( IAccountAuthenticatorResponse response, Account account);
 /** * Returns a Bundle containing the required credentials to copy the account across users. */ void getAccountCredentialsForCloning( IAccountAuthenticatorResponse response, Account account);
 /** * Uses the Bundle containing credentials from another instance of the authenticator to create * a copy of the account on this user. */ void addAccountFromCredentials( IAccountAuthenticatorResponse response, Account account, Bundle accountCredentials);
 }
 }
}