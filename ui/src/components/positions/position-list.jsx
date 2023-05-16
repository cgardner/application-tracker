import { Typography } from "@material-tailwind/react";
import { useQuery } from "@tanstack/react-query";
import { fetchPositions } from "../../api/positions";
import { Fragment } from "react";

export default function PositionList() {
    const { isLoading, isError, data, error } = useQuery({
        queryKey: ['positions'],
        queryFn: fetchPositions,
    })

    if (isLoading) {
        return (
            <div className="flex justify-center items-center">
                Loading...
            </div>
        )
    }

    if (isError) {
        return (
            <div className="flex justify-center items-center">
                <Typography color="red">{error.message}</Typography>
            </div>
        )
    }

    return (
        <div>
            <Typography variant="h2" className="mb-2" color="gray">Position List</Typography>
            <div className="flex flex-col">
                {data.map((position) => (
                    <div key={position.id} className="flex flex-row justify-between items-center border-b border-gray-200 py-2">
                        <div className="flex flex-col">
                            <Typography variant="h5">{position.title}</Typography>
                            <Typography color="gray">{position.company}</Typography>
                            <PositionMetaDataItem title="Date Applied" value={position.appliedDate} />
                            <PositionMetaDataItem title="Date Screened" value={position.screenDate} />
                            <PositionMetaDataItem title="Date Interviewed" value={position.interviewDate} />
                            <PositionMetaDataItem title="Date Offered" value={position.offerDate} />
                            <PositionMetaDataItem title="Date Rejected" value={position.rejectDate} />
                            <Typography variant="h6" color="gray">Notes</Typography>
                            <Typography>{position.notes}</Typography>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    )
}

function PositionMetaDataItem({ title, value }) {
    return (
        <Fragment>
            <Typography variant="small" className="font-semibold">
                {title}
            </Typography>
            <Typography variant="small">
                {value}
            </Typography>
        </Fragment>
    )
}