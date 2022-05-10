const Badge = (props) => {
    return (
        <div
            style={{
                border: "1px solid black",
                width: "320px",
                borderRadius: "8px",
                padding: "8px",
                display: "flex",
                height: "80px",
            }}
        >
            <div style={{ width: "75%" }}>
                <h4>{props.firstName}</h4>
                <h5>{props.lastName}</h5>
            </div>
            <img src={props.avatarImage} height="64px" />
        </div>
    );
};

export default Badge;