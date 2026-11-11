// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/android/accounts/IAccountAuthenticatorResponse.aidl
package android.accounts;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Bundle;

/**
 * Stub interface for IAccountAuthenticatorResponse.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IAccountAuthenticatorResponse.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IAccountAuthenticatorResponse.java {
 private static final String DESCRIPTOR = "android.accounts.IAccountAuthenticatorResponse.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IAccountAuthenticatorResponse.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IAccountAuthenticatorResponse.java) {
 return (IAccountAuthenticatorResponse.java) iface;
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

 public static class Proxy implements IAccountAuthenticatorResponse.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 void onResult( Bundle value); void onRequestContinued(); void onError(int errorCode, String errorMessage);
 }
 }
}