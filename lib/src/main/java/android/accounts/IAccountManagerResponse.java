// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/android/accounts/IAccountManagerResponse.aidl
package android.accounts;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Bundle;

/**
 * Stub interface for IAccountManagerResponse.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IAccountManagerResponse.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IAccountManagerResponse.java {
 private static final String DESCRIPTOR = "android.accounts.IAccountManagerResponse.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IAccountManagerResponse.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IAccountManagerResponse.java) {
 return (IAccountManagerResponse.java) iface;
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

 public static class Proxy implements IAccountManagerResponse.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 void onResult( Bundle value); void onError(int errorCode, String errorMessage);
 }
 }
}