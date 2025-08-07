package androidx.core.net;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketImpl;

class DatagramSocketWrapper extends Socket {
    DatagramSocketWrapper(DatagramSocket socket, FileDescriptor fd) {
        super(new DatagramSocketImplWrapper(socket, fd));
    }

    private static class DatagramSocketImplWrapper extends SocketImpl {
        DatagramSocketImplWrapper(DatagramSocket socket, FileDescriptor fd) {
            ((SocketImpl) this).localport = socket.getLocalPort();
            ((SocketImpl) this).fd = fd;
        }

        @Override
        protected void accept(SocketImpl newSocket) {
            throw new UnsupportedOperationException();
        }

        @Override
        protected int available() {
            throw new UnsupportedOperationException();
        }

        @Override
        protected void bind(InetAddress address, int port) {
            throw new UnsupportedOperationException();
        }

        @Override
        protected void close() {
            throw new UnsupportedOperationException();
        }

        @Override
        protected void connect(String host, int port) {
            throw new UnsupportedOperationException();
        }

        @Override
        protected void connect(InetAddress address, int port) {
            throw new UnsupportedOperationException();
        }

        @Override
        protected void create(boolean isStreaming) {
            throw new UnsupportedOperationException();
        }

        @Override
        protected InputStream getInputStream() {
            throw new UnsupportedOperationException();
        }

        @Override
        protected OutputStream getOutputStream() {
            throw new UnsupportedOperationException();
        }

        @Override
        protected void listen(int backlog) {
            throw new UnsupportedOperationException();
        }

        @Override
        protected void connect(SocketAddress remoteAddr, int timeout) {
            throw new UnsupportedOperationException();
        }

        @Override
        protected void sendUrgentData(int value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object getOption(int optID) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setOption(int optID, Object val) {
            throw new UnsupportedOperationException();
        }
    }
}
