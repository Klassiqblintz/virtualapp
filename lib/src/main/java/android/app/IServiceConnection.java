// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/android/app/IServiceConnection.aidl
package android.app;

import android.os.IBinder;
import android.os.IInterface;
import android.content.ComponentName;

/**
 * Stub interface for IServiceConnection.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface IServiceConnection.java extends IInterface {
 public static abstract class Stub extends android.os.Binder implements IServiceConnection.java {
 private static final String DESCRIPTOR = "android.app.IServiceConnection.java";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IServiceConnection.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IServiceConnection.java) {
 return (IServiceConnection.java) iface;
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

 public static class Proxy implements IServiceConnection.java {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 void connected( ComponentName name, IBinder service);
 }
 }
}