// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/android/content/IIntentReceiver.aidl
package android.content;

import android.os.IBinder;
import android.os.IInterface;
import android.content.Intent;
import android.os.Bundle;

/**
 * Stub interface for IIntentReceiver.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface  extends IInterface {
 public static abstract class Stub extends android.os.Binder implements  {
 private static final String DESCRIPTOR = "android.content.";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IIntentReceiver.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof ) {
 return (IIntentReceiver) iface;
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

 public static class Proxy implements  {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 void performReceive( Intent intent, int resultCode, String data, Bundle extras, boolean ordered, boolean sticky, int sendingUser);
 }
 }
}