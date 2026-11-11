// Auto-generated stub from AIDL: lib/src/main/aidl/android/content/pm/IPackageDeleteObserver2.aidl;
package android.content.pm;
;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
;
/**;
 * Stub interface for IPackageDeleteObserver2.;
 * This replaces the AIDL-generated class for environments that don't auto-compile AIDL.;
 */;
public interface IPackageDeleteObserver2 extends IInterface {;
 /** Local class (Binder subclass) */;
 public static abstract class Stub extends android.os.Binder implements IPackageDeleteObserver2 {;
 private static final String DESCRIPTOR = "android.content.pm.IPackageDeleteObserver2";
;
 public Stub() {;
 this.attachInterface(null, DESCRIPTOR);
 }
;
 public static IPackageDeleteObserver2 asInterface(IBinder obj) {;
 if (obj == null) return null;
 android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
 if (iface != null && iface instanceof IPackageDeleteObserver2) {;
 return (IPackageDeleteObserver2) iface;
 }
 return new Proxy(obj);
 }
;
 @Override
 public IBinder asBinder() {;
 return this;
 }
;
 @Override
 public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws android.os.RemoteException {;
 switch (code) {;
 case INTERFACE_TRANSACTION:;
 reply.writeString(DESCRIPTOR);
 return true;
 case NEEDS_DEFAULT_TRANSACTION:;
 return onTransact(code, data, reply, flags);
 default:;
 return super.onTransact(code, data, reply, flags);
 }
 }
;
 public static class Proxy implements IPackageDeleteObserver2 {;
 private IBinder mRemote;
;
 public Proxy(IBinder remote) {;
 mRemote = remote;
 }
;
 @Override
 public IBinder asBinder() {;
 return mRemote;
 }
;
 public String getInterfaceDescriptor() {;
 return DESCRIPTOR;
 }
 /*;
 * Copyright (C) 2014 The Android Open Source Project;
 *;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.;
 * You may obtain a copy of the License at;
 *;
 * http://www.apache.org/licenses/LICENSE-2.0;
 *;
 * Unless required by applicable law or agreed to in writing, software;
 * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.;
 * See the License for the specific language governing permissions and;
 * limitations under the License.;
 */;
;
 package android.content.pm;
;
;
 void onUserActionRequired(in Intent intent);
 void onPackageDeleted(String packageName, int returnCode, String msg);
;
;
 @Override
 public void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw) {;
 }
 }
 }
}
;
