import { getSession } from "next-auth/react";
import Head from "next/head";
import Navbar from "../components/Navbar";
import AddUser from "../components/Adduser";
import Login from "../components/Login";

export default function Home({ session }) {
  if (!session) return <Login />;
  return (
    <div>
      <Head>
        <title>User management App</title>
      </Head>
      <Navbar />

      <main>
        <AddUser />
      </main>
    </div>
  );
}

export async function getServerSideProps(context) {
  const session = await getSession(context);
  return {
    props: { session },
  };
}
