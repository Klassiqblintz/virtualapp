// Auto-generated stub from AIDL: /root/virtualapp_build/lib/src/main/aidl/com/lody/virtual/server/IPackageInstaller.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.content.pm.IPackageDeleteObserver2;
import android.content.pm.IPackageInstallerCallback;
import android.content.pm.IPackageInstallerSession;
import android.content.IntentSender;
import android.graphics.Bitmap;

/**
 * Stub interface for IPackageInstaller.java.
 * Generated from AIDL for environments without an AIDL compiler.
 */
public interface  extends IInterface {
 public static abstract class Stub extends android.os.Binder implements  {
 private static final String DESCRIPTOR = "com.lody.virtual.server.";

 public Stub() {
 this.attachInterface(null, DESCRIPTOR);
 }

 public static IPackageInstaller.java asInterface(IBinder obj) {
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof ) {
 return (IPackageInstaller) iface;
 }
 return new Proxy(obj);
 }

 @Override
 public IBinder asBinder() { return this; }

 @Override
 public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
 switch (code) {
 case android.os.IBinder.INTERFACE_TRANSACTION:;
 reply.writeString(DESCRIPTOR);
 return true;
 default:;
 return super.onTransact(code, data, reply, flags);
 }
 }

 public static class Proxy implements  {
 private IBinder mRemote;
 public Proxy(IBinder remote) { mRemote = remote; }
 @Override public IBinder asBinder() { return mRemote; }
 public String getInterfaceDescriptor() { return DESCRIPTOR; }
 int createSession( SessionParams params, String installerPackageName, int userId);
 void updateSessionAppIcon(int sessionId, Bitmap appIcon); void updateSessionAppLabel(int sessionId, String appLabel);
 void abandonSession(int sessionId);
 IPackageInstallerSession openSession(int sessionId);
 SessionInfo getSessionInfo(int sessionId);
 VParceledListSlice getAllSessions(int userId); VParceledListSlice getMySessions(String installerPackageName, int userId);
 void registerCallback(IPackageInstallerCallback callback, int userId); void unregisterCallback(IPackageInstallerCallback callback);
 void uninstall(String packageName, String callerPackageName, int flags, IntentSender statusReceiver, int userId);
 void setPermissionsResult(int sessionId, boolean accepted);
 }
 }
}
