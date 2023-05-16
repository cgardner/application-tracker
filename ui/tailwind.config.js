import withMT from '@material-tailwind/react/utils/withMT'
/** @type {import('tailwindcss').Config} */
export default withMT({
  content: [
    "./src/**/*.{js,jsx,ts,tsx}",
  ],
  theme: {
    container: {
      center: true,
    },
    extend: {},
  },
  plugins: [],
})