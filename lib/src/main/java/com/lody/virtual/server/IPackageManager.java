// Auto-generated stub from AIDL: lib/src/main/aidl/com/lody/virtual/server/IPackageManager.aidl
package com.lody.virtual.server;

import android.os.IBinder;
import android.os.IInterface;

public interface IPackageManager extends IInterface {
    public static abstract class Stub extends android.os.Binder implements IPackageManager {
        private static final String DESCRIPTOR = "com.lody.virtual.server.IPackageManager";

        public Stub() {
            this.attachInterface(null, DESCRIPTOR);
        }

        public static IPackageManager asInterface(IBinder obj) {
            if (obj == null) return null;
            android.os.IInterface iface = obj.queryLocalInterface(DESCRIPTOR);
            if (iface != null && iface instanceof IPackageManager) {
                return (IPackageManager) iface;
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

        public static class Proxy implements IPackageManager {
            private IBinder mRemote;
            public Proxy(IBinder remote) { mRemote = remote; }
            @Override public IBinder asBinder() { return mRemote; }
            public String getInterfaceDescriptor() { return DESCRIPTOR; }
        package com.lody.virtual.server
        
        
        
        
        
                int getPackageUid(String packageName, int userId)
        
                String[] getPackagesForUid(int vuid)
        
                List<String> getSharedLibraries(String pkgName)
        
                int checkPermission(String permName, String pkgName, int userId)
        
                PackageInfo getPackageInfo(String packageName, int flags, int userId)
        
                ActivityInfo getActivityInfo(in ComponentName componentName, int flags, int userId)
        
                boolean activitySupportsIntent(in ComponentName component, in Intent intent,
                                                   										  in String resolvedType)
                 ActivityInfo getReceiverInfo(in ComponentName componentName, int flags, int userId)
        
                 ServiceInfo getServiceInfo(in ComponentName componentName, int flags, int userId)
        
                 ProviderInfo getProviderInfo(in ComponentName componentName, int flags, int userId)
        
                 ResolveInfo resolveIntent(in Intent intent, in String resolvedType, int flags, int userId)
        
                 List<ResolveInfo> queryIntentActivities(in Intent intent,in  String resolvedType, int flags, int userId)
        
                 List<ResolveInfo> queryIntentReceivers(in Intent intent, String resolvedType, int flags, int userId)
        
                 ResolveInfo resolveService(in Intent intent, String resolvedType, int flags, int userId)
        
                 List<ResolveInfo> queryIntentServices(in Intent intent, String resolvedType, int flags, int userId)
        
                 List<ResolveInfo> queryIntentContentProviders(in Intent intent, String resolvedType, int flags, int userId)
        
                 VParceledListSlice getInstalledPackages(int flags, int userId)
        
                 VParceledListSlice getInstalledApplications(int flags, int userId)
        
                 PermissionInfo getPermissionInfo(in String name, int flags)
        
                 List<PermissionInfo> queryPermissionsByGroup(in String group, int flags)
        
                 PermissionGroupInfo getPermissionGroupInfo(in String name, int flags)
        
                 List<PermissionGroupInfo> getAllPermissionGroups(int flags)
        
                 ProviderInfo resolveContentProvider(in String name, int flags, int userId)
        
                 ApplicationInfo getApplicationInfo(in String packageName, int flags, int userId)
        
                 VParceledListSlice queryContentProviders(in String processName, int vuid, int flags)
        
                 List<String> querySharedPackages(in String packageName)
        
                 String getNameForUid(int uid)
        
                 IPackageInstaller getPackageInstaller()
        
        }
    }
}
