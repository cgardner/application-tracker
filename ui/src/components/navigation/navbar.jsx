import { Navbar, Typography } from "@material-tailwind/react";

export default function NavBar() {
    return (
        <Navbar color="blue" className="mx-auto max-w-screen-xl py-2 px-4 lg:px-8 lg:py-4">
            <Typography variant="h1">
                Job Application Tracker
            </Typography>
        </Navbar>
    )
}